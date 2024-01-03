package com.atguigu06.polymorphism.exer4;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer4.Woman
 * @Date: 2024年01月03日 09:43
 * @Description:
 */
public class Woman extends Person{

    @Override
    public void eat() {
        System.out.println("女人优雅地吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人去女洗手间");
    }

    public void makeup() {
        System.out.println("上厕所后补妆");
    }
}
