package com.atguigu06.polymorphism;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.Person
 * @Date: 2023年12月28日 14:59
 * @Description:
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }
}
