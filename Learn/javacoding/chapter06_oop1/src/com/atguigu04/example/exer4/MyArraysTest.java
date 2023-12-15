package com.atguigu04.example.exer4;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.example.exer4.MyArraysTest
 * @Date: 2023年12月15日 13:35
 * @Description:
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] i1 = new int[]{1,2,3,4,5,645};
        MyArrays myArray1 = new MyArrays();
        System.out.println(myArray1.getMax(i1));
    }
}
