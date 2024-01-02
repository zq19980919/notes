package com.atguigu06.polymorphism.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer3.Person
 * @Date: 2024年01月02日 09:46
 * @Description:
 */
public class Person{
    protected String name="person";
    protected int age=50;

    public String getInfo(){
        return "Name: "+ name + "\nage: " + age;
    }
}
