package com.auguigu08.constructor;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.Person
 * @Date: 2023年12月25日 10:47
 * @Description:
 */
public class Person {
    // 属性
    String name;
    int age;

    // 构造器
//    public Person() {
//        System.out.println("Person()...");
//    }
    public Person(int a) {
        age = a;
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }


    //方法
    public void eat() {
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人睡觉了"+hour+"个小时");
    }
}
