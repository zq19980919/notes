package com.atguigu05.method_more._03valuetransfer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._03valuetransfer.ValueTransferTest1
 * @Date: 2023年12月15日 16:38
 * @Description:
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();
        //1. 对于基本数据类型的变量来说
        int m = 10;
        test.method1(m);
        System.out.println("m的数值为"+m);// 10 传递的是数据值而不是地址
        int[] arr = new int[]{1,2,3,4,5};
        test.method2(arr);
        System.out.println(arr[0]);

    }
    public void method1(int m){
        m++;
    }
    public void method2(int[] arr){
        arr[0] = 10;
    }
}
