package com.atguigu07_abstract;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07_abstract.Person
 * @Date: 2024年01月10日 16:07
 * @Description:
 */
public abstract class Person extends Creature{
    String name;
    int age;

    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(); // 抽象方法

    public abstract void sleep();// 抽象方法
}
