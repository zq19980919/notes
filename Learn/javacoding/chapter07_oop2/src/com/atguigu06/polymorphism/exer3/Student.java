package com.atguigu06.polymorphism.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer3.Student
 * @Date: 2024年01月02日 10:04
 * @Description:
 */
public class Student extends Person{
    protected String school="pku";

    public String getInfo(){
        return "Name: "+ name + "\nage: " + age + "\nschool: " + school;
    }
}
