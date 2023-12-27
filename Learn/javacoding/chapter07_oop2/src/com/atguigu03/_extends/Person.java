package com.atguigu03._extends;

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

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
