/*
* 此VariableTest4用于测试强制类型转换
*
* 规则：
* 1.如果需要将容量大的变量类型转换成小的，需要使用强制类型转换
* 2.强制类型转换需要强转符，()。在()内指明要转换为的数据类型。
* 3.强制类型转换可能会导致精度损失问题。
*/

public class VariableTest4 {
    public static void main(String[] args) {
        double d1 = 12.3; //自动类型提升
//        int i1 = d1;编译失败
        int i1 = (int)d1;
        System.out.println(i1);

        //精度损失的例子2
        int i5 = 128;
        byte b1 = (byte)i5;
        System.out.println(b1);//-128


    }
}