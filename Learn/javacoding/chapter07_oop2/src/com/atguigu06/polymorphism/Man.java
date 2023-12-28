package com.atguigu06.polymorphism;

import com.atguigu06.polymorphism.Person;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.Man
 * @Date: 2023年12月28日 15:00
 * @Description:
 */
public class Man extends Person {
    boolean isSmoking = true;
    int id = 1002;

    public void eat() {
        System.out.println("男人吃饭");
    }

    public void sleep() {
        System.out.println("男人睡觉");
    }

    public void earnMoney() {
        System.out.println("男人赚钱");
    }
}
