package com.zhangqiang.test02;

public class VariableTest3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;
        float f1 = l1;

        byte b1 = 12;
        int i3 = b1+i1;

        //编译不通过
//        byte b2 = b1+i1;

        //*****************************************
        //特殊的情况1 byte short做运算：
        byte b3 = 12;
        short s1 = 10;
        int s2 = s1 + b3;

        //编译不通过
        //short s2 = b3+s1;

        byte b4 = 10;
        //编译不通过
        //byte b5 = b3 + b4;

        //特殊的情况2 char
        char c1 = 'a';
        //编译不通过
        //char c2 = c1 + b3;
        int i4 = c1 + b3;

        //****************************
        long l2 = 123L;
        long l3 = 123; // 理解为：自动类型提升

        //超出int类型，编译不通过
        //long l4 = 123123123123;
        long l5 = 123123123123L;

        //练习2
        float f2 = 12.5F;
        //编译不通过
//        float f3 = 12.3;不满足自动提升的规则(double-->float)。所以报错

        //练习3
        //整型常量，规定为int
        byte b5 = 10;
//        byte b6 = b5+1;
        int ii1 = b5 + 1;
        //浮点型常量，规定为double
        double dd1 = b5 + 12.3;

        //练习4：说明为什么不允许变量名是数字开头的。为了“自洽”
        /*
        int 123L = 12;
        long 16 = 123L;
         */
    }
}
