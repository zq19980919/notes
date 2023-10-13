# Kafka基本概念
## Kafka定义
### 传统定义
分布式基于发布/订阅模式的消息队列，主要应用于大数据实时处理。消息发布不会直接将消息发送给特定订阅者，而是将发布信息分为不同类别，订阅者只接收感兴趣的消息。
### 新定义
开源的分布式事件流平台，主要被用于数据管道、流分析、数据集成和关键任务应用。
### 消息队列
kafka、ActiveMQ、RabbitMQ、RocketMQ等。大数据中kafka，java中用其他
传统消息队列应用场景包括：缓存/消峰、解耦、和异步通信。
* 缓存：防止缓存击穿等。
* 解耦：消除来源和去向差异。
* 异步通信：允许用户把消息放入队列，但不立即处理，需要的时候再去处理。

两种模式：
* 点对点模式：消费者主动拉取数据，消息收到后清除消息
* 发布/订阅模式：可以有多个topic主题，消费者消费数据后，不删除数据
### Kafka基础架构
Producer --》 Topic A（Kafka cluster(broker0,broker1,broker2...)）--》Consumer
* 为方便扩展，并提高吞吐量，一个Topic分为多个partition
* 配合分区的设计，提出消费者组的概念，组内每个消费者并行消费
* 为提高可用性，为每个partition增加若干副本，类似NameNode HA

注：这里存在3种选举机制：控制器(Broker)选举、分区副本选举、消费者组选举。Zookeeper可记录相关信息(有哪些brokers,分区副本有哪些)(2.8.0之后该模式可选)
# Kafka生产者
## Kafka生产者消费原理
kafka Producer创建main线程 发送到拦截器(interceptors) 接着到序列化器(Serializer) 接着分区器(partitioner)发送到缓存队列RecordAccumulator（多个双端队列，默认内存是32m，采用内存池）中，ProducerBatch(默认是16k)满后/或者等待时间到达linger.ms设置的时间之后，Sender线程读取（唤醒sender线程？），Sender线程以每一个节点为key，然后每个key
跟着请求，默认每个broker节点最多缓存5个请求，然后Sender线程中的Selector发送数据，kafka集群收到后进行应答acks，acks机制分为3种：0,1，-1（all） 接下来分别解释
* 0：生产者发送过来的数据，不需要等数据落盘应答
* 1：生产者发送过来的数据，Leader等数据落盘应答
* -1（all）：生产者发送过来的数据，Leader和ISR里面的所有节点收齐数据后应答。-1和all等价。

若acks成功，则清理缓存队列中的数据，若失败，则重试
## 异步发送API
这里是指外部数据发送到缓存队列中（需要使用多线程）
1. 普通异步发送 直接调用send方法即可
2. 带回调函数的异步发送 回调函数会在Producer收到ack时调用，为异步，该方法有两个参数，分别为元数据信息(RecordMetadata)和异常
信息()
## 同步发送API
同步是返回结果后再发下一批，异步不用等结果(异步发送后＋get)
## 生产者分区
### kafka分区好处
1. 便于合理使用存储资源，每个Partition在一个Broker上存储，可以把海量数据按照分区切割成一块一块数据存储在多台Broker上。合理控制分区的任务，可以实现负载均衡的效果。
2. 提高并行度，生产者可以以分区为单位发送数据；消费者可以以分区为单位进行消费数据。
		
### 生产者发送消息的分区策略
1. 默认分区器DefaultPartitioner
在IDEA中ctrl+n 全局查找Defaultpartitioner
2. kafka原则
指明了Partition的情况下，直接将指明的值作为Partition的值：例如partition=0，所有数据写入分区0;
没有指明partition但是有key，将key的hash值与topic的partition数进行取余，得到partition值.例：key1的hash=5，key2hash=6，topic的partition数=2，key1对应的value1写入1号分区，key2的value2写入0号分区;
既没有partition值又没有key值，kafka采用sticky partition，随机选择分区，并尽可能一直使用该分区，待该分区的batch已满或者已完成，kafka再随机一个分区进行使用（和上一次的分区不同）
### 自定义分区器
## 生产者如何提高吞吐量
修改linger.ms:等待时间，修改为5-100ms
compression.type:压缩snappy
RecordAccumulator：缓冲区大小，修改为64m
batch_size：批次大小
## 生产经验——数据可靠性
ack机制来保证：
* 0 生产者发送过来的的数据，无需等数据落盘应答 数据可靠性分析：丢数
* 1 生产者发送过来的数据，Leader收到数据后应答。（假如Leader落盘但未和Follower同步，此时会丢数）
* -1（all） 生产者发送过来的数据，Leader和ISR里面的所有节点收齐数据后应答。

假如此时有一个Follow挂了，迟迟不能完成同步怎么办呢？
Leader维护了一个动态的in-sync replica set(ISR),意为和Leader保持同步的Follower+Leader集合(L:0 isr:0,1,2)。如果Follower长时间未向Leader发送通信请求或同步数据，则该Follower将被提出ISR。该时间阈值由replica.lag.time.max.ms参数设定，默认为30s，比如2超时，此时isr为0,1。这样就不用等长期联系不上或者已经故障的节点。此时假如isr个数为1，仍然有丢数风险。
数据可靠性条件=ACK级别设置为-1+分区副本大于等于2+ISR里应答的最小副本数量大于等于2
ack 0 很少使用 1 一般用于传输普通日志，允许丢个别数据；ack=-1，一般用于传输和钱相关的数据，对可靠性要求比较高的场景。
		
数据重复分析
* 至少一次(At Least Once)=ACK级别设置为-1+分区副本大于等于2+ISR里应答的最小副本数量大于等于2(数据不丢失)
* 最多一次(At Most Once)=ACK级别设置为0
		
At Least Once保证数据不丢失，但是不能保证数据不重复;
At Most Once保证数据不重复，但是不能保证数据不丢失。

## 生产经验——数据去重
### 数据传递语义
精确一次（Excatly Once）主要得利用到kafka幂等性和事务。
幂等性是指Producer不论向Broker发送多少次重复数据，Broker端都只会持久化一条，保证了不重复。
精确一次（Excatly Once)=幂等性+至少一次(ack=-1 + 分区副本大于等于2 + ISR最小副本数量大于等于2)
重复数据判断标准<PID,PArtition,SeqNumber>相同主键的消息提交时，Broker只会持久化一条。
PID：Kafka每次重启分配；Partition分区号；SeqNumber单调自增。
注：幂等性只能保证的是在单分区单回话内不重复。
### 幂等性及幂等性实现原理
PID：
每个 Producer 在初始化时都会被分配一个唯一的 PID。
PID是全局唯一的，Producer 故障后重新启动后会被分配一个新的 PID，这也是幂等性无法做到跨会话的一个原因。Producer的PID需要向sever端进行申请。而server端向 ZooKeeper申请。zk中有一个 /latest_producer_id_block 节点，每个 Broker 向 zk 申请一个 PID 段后，都会把自己申请的 PID 段信息写入到这个节点，这样当其他 Broker 再申请 PID 段时，会首先读写这个节点的信息，然后根据 block_end 选择一个 PID 段，最后再把信息写会到 zk 的这个节点。
Broker向producer返回自己保存的PID，如果PID用尽时，向zookeeper申请新的PID段。

sequence numbers:
对于一个给定的 PID，sequence number 将会从0开始自增，每个 Topic-Partition 都会有一个独立的 sequence number。有了 PID 之后，在 PID+Topic-Partition 级别上添加一个 sequence numbers 信息，就可以实现 Producer 的幂等性了。Producer端会保存每一个Topic-Partition的 last sequence number，在发送消息之前，会在消息的meta中添加此条消息的 sequence number。

### 生产者事务
说明：开启事务，必须开启幂等性
Producer在使用事务功能前，必须先自定义一个唯一的transactional.id,有了transactional.id,即使客户端挂掉，它重启后也能继续处理未完成的事务。具体见知乎收藏。

## 生产经验——数据有序或者乱序
### 数据有序
指的是单分区内有序（有条件），多分区，分区与分区间无序。
### 数据乱序
为了保证数据有序 max.in.flight.requests.per.connection需要设置为1(未开启幂等性)；
现在为了保证数据有序 max.in.flight.requests.per.connection需要设置为5(开启幂等性)
原因：启动幂等后，kafka服务端会缓存Producer发过来的最近5个request的元数据。

# Kafka Broker
## ZK中存储的Kafka信息
记录服务器 /kafka/brokers/ids
记录Leader和ISR /kafka/brokers/topics/first/partitions/0/state 
辅助选举Leader
## Broker总体工作流程
AR：kafka分区中的所有副本统称
1)broker启动后在zk中注册-> 2)controller谁先注册，谁说了算 -> 3)由选举出来的Controller监听brokers变化-> 4)Controller决定Leader选举 选举规则在isr中存活为前提，按照AR中排在前面的优先，例如ar有1,0,2，isr为[1 0 2],则按照1,0,2顺序轮询 -> 5)Controller将节点信息上传到ZK；-> 6)其他Controller从zk同步相关信息；-> 7)假如Leader挂了->8)Controller监听到节点变化 -> 9)获取ISR-> 10)选取新的Leader-> 11)更新Leader和ISR
## Kafka副本
1. 作用：提高数据可靠性
2. 默认副本1个，生产环境一般配置为2个，保证数据的可靠性；太多副本会增加磁盘存储空间，增加网络上数据传输，降低
	效率。
3. Kafka副本分为Leader和Follower。Kafka生产者只会把数据发往Leader，然后follower找Leader同步数据。
4. Kafka分区所有副本称为AR(Assigned Repllicas)，AR=ISR+OSR OSR:表示Follower与Leader副本同步时，延迟过多的副本。
5. Follower故障处理细节
LEO(Log End Offset)：每个副本的最后一个offset，LEO其实就是最新的offset+1。
HW(High Watermark)：所有副本中最小的LEO。
	1. Follower故障后会被临时踢出ISR
	2. 这个期间Leader和Follower继续接收数据
	3. 待该Follower恢复后，Follower会读取本地磁盘记录的上次的HW，并将log文件高于HW的部分截取掉，从HW开始向Leader进行同步。
	4. 等该Follower的LEO大于等于该Partition的HW，即Follower追上Leader之后，就可以重新加入ISR了。
	
6. Leader故障处理细节
	1. Leader发生故障后，会从ISR中选出新Leader
	2. 为保证多个副本间的数据一致性，其余Follower会先将各自的log文件中高于HW的部分截掉，然后从新的Leader同步数据。注：只能保证副本间的数据一致性，并不能保证数据不丢失或者不重复。
	
7. 分区副本分配
手动调整：原因：生产环境中，每台服务器的配置和性能不一致，但是Kafka只会根据自己的代码规则创建对应的分区副本，就会导致个别服务器存储压力过大，所以需要手动调整分区副本的存储。
需求：创建一个新的topic，4个分区，两个副本，名称为Three。将该topic的所有副本都存储到broker0和broker1两台服务器上。
		
8. Leader Partition负载均衡
正常情况下，Kafka本身会把Leader Partition均匀分散在各个机器上，保证每台机器读写吞吐量都是均匀的。但是如果某些broker宕机，会导致Leader Partition过于集中在其他少部分几台broker上，这会导致少数几台的broker的读写请求压力过高，其他宕机的broker重启之后都是follower partition，读写请求很低，造成集群负载不均衡。为此，kafka设置了auto.leader.rebalance.enable,默认是true。阈值为leader.imbalance.per.broker.percentage,默认是10%。每个broker允许的不平衡的leader的比率。如果每个broker超过了这个值，控制器会触发leader的平衡。时间界限是leader.imbalance.check.interval.seconds,默认值300秒。检查leader负载是否平衡的间隔时间。生产情况下最好设置为None，很消耗资源。

9. 增加副本因子
在生产环境中，由于某个主题的重要等级需要提升，我们考虑增加副本。副本数的增加需要先制定计划，然后根据计划执行。

## 文件存储
### 文件存储机制
注：Topic是逻辑上的概念！Partition是物理上的概念。每个partition对应一个log文件，该log文件中存储的就是Producer生产的数据。Producer生产的数据会被不断追加到该log文件末端，为防止log文件过大导致数据定位效率低下，Kafka采取了分片和索引机制，将每个partition分为多个segment。每个segment包括：“.index”文件、“.log”文件和.timeindex等文件。这些文件位于一个文件夹下，该文件夹的命名规则为：topic名称+分区序号，例如：first-0。
index和log文件以当前segment的第一条消息的offset命名。index为稀疏索引，大约每往log文件中写入4kb数据，会往index文件写入一条索引。参数log.index.interval.bytes默认为4kb。
index文件中保存的offset为相对offset，这样能确保offset的值所占空间不会过大，因此能将offset的值控制在固定大小查找步骤：
1. 根据目标offset定位Segment文件
2. 找到小于等于目标offset的最大offset对应的索引项
3. 定位到log文件
4. 向下遍历找到目标Record

### 文件清除策略
kafka中默认的日志保存时间为7天，可以通过调整如下参数修改保存时间
* log.retention.hours 最低优先级小时，默认为7天
* log.retention.minutes 分钟
		log.retention.ms 最高优先级毫秒
* log.retention.check.interval.ms 负责设置检查周期 默认5分钟，日志一旦超过设置的时间，提供两种清除策略：delete和compact 
1. delete日志删除：将过期数据删除log.cleanup.policy=delete 所有数据启用删除策略
	1. 基于时间：默认打开。以segment中所有记录的最大时间戳作为该文件时间戳
	2. 基于大小：默认关闭。超过设置的所有日志总大小，删除最早的segmentlog.retention.bytes,默认等于-1，表示无穷大
2. compact日志压缩 对于相同key的不同value值，只保留最后一个版本
压缩后的offset可能是不连续的，当从这些offset消费消息时，将会拿到比这个offset大的offset对应的消息，并从这个位置开始消费 
注：这个策略只适合特殊场景，比如消息的key是用户ID，value是用户的资料，通过这种压缩策略，整个消息集中就保存了所有用户最新的资料。

### 高效读写数据
1. 本身是分布式集群，可以采用分区技术，并行度高
2. 读数据采用稀疏索引，可以快速定位要消费的数据
3. 顺序写磁盘
4. 页缓存+零拷贝技术
零拷贝：Kafka的数据加工处理操作交由Kafka生产者和消费者处理。Kafka Broker应用层不关心存储的数据，所以就不用走应用层，传输效率高。
PageCache：Kafka重度依赖底层操作系统提供的PageCache功能。当上层有写操作时，操作系统只是将数据写入Pagecache，当读操作发生时，先从PageCache中查找，如果找不到，再从磁盘中读取。实际PageCache是把尽可能多的空闲内存都当做了磁盘缓存来使用。

# Kafka消费者
## Kafka消费方式
消息队列消费主要分为两种方式：
* pull(拉)模式：Consumer采用从broker中主动拉取数据。kafka采用这种方式。
* push(推)模式：kafka没有采用。因为由broker决定消息发送速率，很难适应所有消费者的消费速率。

pull模式不足之处是，如果Kafka没有数据，消费者可能会陷入循环中，一直返回空数据。
## Kafka消费者工作流程
### 消费者总体工作流程
每个分区的数据只能由消费者组中一个消费者消费offset：用于标识当前消费序号。每个消费者的offset由消费者提交到系统主题保存
### 消费者组原理
2)消费者组原理
形成一个消费者组的条件是所有消费者的groupid相同。
消费者组内各个消费者负责消费不同分区的数据，一个分区只能由一个组内消费者消费。
消费者组之间互不影响。所有的消费者都属于某个消费者组，即消费者组是一个逻辑上的订阅者。
如果消费者组中消费者超过主题分区数量，则有一部分消费者就会闲置，不会接收任何消息。
### 消费者组初始化流程
coordinator:辅助实现消费者组的初始化和分区的分配
coordinator节点选择：groupid的hashcode值%50(_consumer_offsets的分区数量)
1. 每个consumer都发送JoinGroup请求
2. 选出一个consumer作为leader
3. 把要消费的topic情况发送给leader消费者
4. leader会负责制定消费方案
5. 把消费方案发给coordinator
6. Coordinator就把消费方案下发给各个consumer
7. 每个消费者都会和coordinator保持心跳(默认3s),一旦超时(session.timeout.ms=45s)，该消费者就会被移除，并且触发再平衡，或者消费者处理消息的时间过长(max.poll.interval.ms5分钟)，也会触发再平衡
### 消费者组详细消费流程
构建ConsumerNetworkClient->消费者组发送消费请求->客户端调用send方法->onSuccess拉取消息进入
completedFetches(queue)->消费者对消息进行反序列化->发送至拦截器->处理数据关键参数 Fetch.min.bytes每批次默认拉取大小 默认1字节
fetch.max.wait.ms 默认500ms
fetch.max.bytes默认50m
## 消费者API
查看代码
## 分区的分配以及再平衡
1. 一个consumer group中有多个consumer组成，一个topic有多个partition组成，现在的问题是，到底由哪个consumer来消费哪个partition的数据。
2. Kafka有四种主流的分区分配策略：Range、RoundRobin、Sticky、CoopearativeSticky.
可以通过配置参数partition.assignment.strategy修改分区的分配策略。默认的策略是Range+CoopearativeSticky.kafka可以同时使用多个分区分配策略。
### 分区分配策略之Range
Range是对每个topic而言的。首先对同一个topic里面的分区按照序号进行排序，并对消费者按照字母顺序进行排序。
如：7个分区：0 1 2 3 4 5 6 三个消费者排序：C0 C1 C2
通过partition/consumer来决定每个消费者应该消费几个分区。如果除不尽，那么前面几个消费者将会多消费一个分区。
		
注：如果只针对1个topic，C0消费者对消费1个分区影响不是很大。但是如果有N多个topic，那么针对每个topic，
消费者C0都将多消费1个分区，topic越多，C0消费的分区会比其他消费者明显多消费N个分区。容易产生数据倾斜。
### 分区分配策略之RoundRobin
RoundRobin是针对集群中所有的topic而言。

RoundRobin轮询分区策略，是把所有的partition和所有的consumer都列出来，然后按照hashcode进行排序，最后通过轮询算法来分配partition给到各个消费者。
		
### Sticky以及再平衡
粘性分区定义：可以理解为分配的结果带有“粘性的”，即在执行一次新的分配之前，考虑上一次分配的结果，尽量少的调整分配的变动，可以节省大量的开销。

这种分区策略首先会尽量均衡的放置分区到消费者上面，在出现同一消费者组内出现问题时，会尽量保持原有分配的分区不变化。
## offset位移
### offset的默认维护位置
consumer默认将offset保存在Kafka一个内置的topic中，该topic为__consumer_offsets。__consumer_offset主题里面采用key和value的方式存储数据。key是group.id+topic+分区号，value就是当前offset的值。每隔一段时间，kafka内部会对这个topic进行compact,也就是每个group.id+topic+分区号就保留最新数据。
### 自动提交offset
为了使我们能够专注自己的业务逻辑，Kafka提供了自动提交的offset的功能。
* enable.auto.commit:是否开启自动提交offset功能，默认是true
* auto.commit.interval.ms:自动提交offset的时间间隔，默认为5s
### 手动提交offset
虽然自动提交offset十分简单便利，但由于是基于时间提交的，开发人员难以把握offset提交的时机。因此Kafka还提供手动提交offset的API。
手动提交offset的方式有两种。分别是commitSync(同步提交)和commitAsync（异步提交）。两者的相同点是，都会将本次提交的一批数据最高的偏移量提交；不同点是，同步提交阻塞当前线程，一直到提交成功，并且会自动失败重试（由不可控因素导致，也会出现提交失败）；而异步提交则没有失败重试机制，故有可能提交失败。
* commitSync:必须等待offset提交完毕，再去消费下一批数据
* commitAsync：发送完提交offset请求后，就开始消费下一批数据了

### 指定offset消费
auto.offset.reset = earliest|latest|none 默认是latest
当Kafka中没有初始偏移量（消费者组第一次消费）或服务器上不再存在当前偏移量时(例如该数据已被删除)，怎么办？
1. earliest:自动将偏移量重置为最早的偏移量，--from-beginning.
2. latest(默认值):自动将偏移量重置为最新偏移量	。
3. none:如果未找到消费者组的先前偏移量，则向消费者抛出异常。
   
### 指定时间消费
需求：在生产环境中，会遇到最近消费的几个小时数据异常，想重新按时间消费，例如要求按照时间消费前一天的数据，怎么处理？

### 漏消费和重复消费
重复消费：已经消费了数据，但是offset没提交；
漏消费：先提交offset后消费，有可能会造成数据的漏消费。
1. 场景1：重复消费。自动提交offset引起。
	1）Consumer每5s提交offset
	2）如果提交offset后的2s，consumer挂了
	3）再次重启consumer，则从上一次提交的offset处继续消费，导致重复消费
2. 场景2：漏消费。设置offset为手动提交，当offset被提交时，数据还在内存中未罗盘，此时刚好消费者线程被kill掉，那么offset已经提交，但是数据未处理，导致这部分内存中的数据丢失
思考：怎么能做到既不漏消费也不重复消费呢？详看消费者事务。

## 生产经验——消费者事务
如果想完成Consumer端的精确一次性消费，那么需要Kafka消费端将消费过程和提交offset过程做原子绑定。此时我们需要将Kafka的offset保存到支持事务的自定义介质（比如MySQL）。

## 生产经验——数据积压（消费者如何提高吞吐量）
1. 如果是Kafka消费能力不足，则可以考虑增加Topic的分区数，并且同时提升消费组的消费者数量，消费者数=分区数（两者缺一不可）
2.  如果是下游的数据处理不及时：提高每批次拉取的数量。批次拉取数据过少（拉取数据/处理时间<生产速度），使处理的数据小于生产的数据，也会造成数据积压