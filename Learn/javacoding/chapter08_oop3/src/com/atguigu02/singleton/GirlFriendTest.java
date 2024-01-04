package com.atguigu02.singleton;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu02.singleton.GirlFriend
 * @Date: 2024年01月04日 10:13
 * @Description:
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}

//懒汉式单例模式
class GirlFriend{
    //1.私有化类的构造器
    private GirlFriend(){
    }

    //2.声明当前类的实例
    //4.要求此对象也必须声明为静态的
    private static GirlFriend instance = null;

    //3. 通过getInstance()方法获取类的实例，如果未创建对象，则在方法内部进行创建
    public GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
