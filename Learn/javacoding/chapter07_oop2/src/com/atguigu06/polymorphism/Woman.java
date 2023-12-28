package com.atguigu06.polymorphism;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.Woman
 * @Date: 2023年12月28日 15:02
 * @Description:
 */
public class Woman extends Person  {
    boolean isBeauty;

    public void eat() {
        System.out.println("女人吃饭");
    }

    public void sleep() {
        System.out.println("女人睡觉");
    }

    public void shopping() {
        System.out.println("女人购物");
    }
}
