package com.atguigu06.polymorphism.exer4;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer4.Man
 * @Date: 2024年01月03日 09:40
 * @Description:
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人大口吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人去男厕所");
    }

    public void smoke() {
        System.out.println("厕后一支烟");
    }
}
