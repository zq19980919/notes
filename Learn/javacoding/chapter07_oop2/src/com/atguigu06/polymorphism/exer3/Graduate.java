package com.atguigu06.polymorphism.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer3.Graduate
 * @Date: 2024年01月02日 10:02
 * @Description:
 */
public class Graduate extends Student{
    public String major="IT";

    public String getInfo(){
        return "Name: "+ name + "\nage: " + age + "\nschool: " + school + "\nmajor: " + major;
    }
}
