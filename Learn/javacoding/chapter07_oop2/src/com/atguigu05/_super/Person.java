package com.atguigu05._super;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.Person
 * @Date: 2023年12月27日 10:10
 * @Description:
 */
public class Person {
    //属性
    String name;
    private int age;
    int id = 1001;//身份证号

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
    }

    public void doSport(){
        System.out.println("人运动");
    }
}
