package com.atguigu05.method_more._03valuetransfer;

import java.util.Arrays;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._03valuetransfer.ValueTransferTest
 * @Date: 2023年12月15日 15:19
 * @Description:
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        // 1. 基本数据类型的局部变量
        int i1 = 1;
        int i2 = i1; // 基本数据类型传递的是数据值
        System.out.println("i1 = " + i1+ " i2 = "+i2);
        i2++;
        System.out.println("i1 = " + i1+ " i2 = "+i2);
        // 2.引用数据类型 数组
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1; // 引用数据类型传递的是地址值
        System.out.println("arr1 = " + Arrays.toString(arr1) + " arr2 = "+ Arrays.toString(arr2));
        arr2[0] = 10;
        System.out.println("arr1 = " + Arrays.toString(arr1) + " arr2 = "+ Arrays.toString(arr2));

        // 类
        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;
        o2.orderId = 1002;
        System.out.println(o1.orderId);


    }
}
class Order{
    int orderId;
}
