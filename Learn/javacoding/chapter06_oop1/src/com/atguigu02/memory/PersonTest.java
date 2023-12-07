package com.atguigu02.memory;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 通过对象调用属性
        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';

        // 通过对象调用方法
        p1.eat();
        p1.sleep();
        p1.interests("游泳");

        //下面虽然是p2调用的方法，但是p2和p1指向的是同一个对象
        // 所以修改p2的属性，也会影响p1的属性
        // 类似于浅拷贝
        // 如何区分？看是否有new关键字，只有new了才会开辟新的内存空间
        Person p2 = p1;
        p2.age = 28;
        System.out.println(p1.age);
    }
}
