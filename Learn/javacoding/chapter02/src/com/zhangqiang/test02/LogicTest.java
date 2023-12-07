package com.zhangqiang.test02;

/*
 * 测试运算符的使用4：逻辑运算符
 * 1. & && | || ! ^
 * 2. 说明：
 *  逻辑运算符针对的是Boolean类型进行操作
 *  逻辑运算符运算的结果也都是Boolean类型
 *  逻辑运算符常使用条件判断结构、循环结构中
 */
public class LogicTest {
    public static void main(String[] args) {
        /* 
         区分 & 和 &&
         两个符号表达都是且的关系
         &&具有短路作用(前一个为false则不执行后一个)
         开发中推荐使用 &&
        */
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++>10)){
            System.out.println("难绷");
        }else{
            System.out.println("蚌埠");
        }
        System.out.println("num1 = "+ num1);
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++>10)){
            System.out.println("难绷");
        }else{
            System.out.println("蚌埠");
        }
        System.out.println("num2 = "+ num2);
    }
}
