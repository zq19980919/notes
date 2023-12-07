package com.atguigu01.oop;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建Phone的对象
        // 复习:数据类型 变量名 = 变量值
//        Scanner scann = new Scanner(System.in);
        Phone myphone = new Phone();

        // 通过Phone的对象，调用其内部声明的属性和方法
        myphone.name = "huawei P50";
        myphone.price = 6999;

        System.out.println(myphone.name);
        System.out.println(myphone.price);

        // 调用方法
        myphone.call();
        myphone.sendMessage("hello");
        myphone.playGame("王者荣耀");
    }
}
