package com.atguigu02.memory;

public class Person {
    // 属性
    String name;// 姓名
    int age;
    char gender;

    // 方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void interests(String hobby) {
        System.out.println("人的爱好是" + hobby);
    }
}
