package com.atguigu03._extends;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.Student
 * @Date: 2023年12月27日 10:12
 * @Description:
 */
public class Student extends Person{
    String school;

    public void study(){
        System.out.println("学生学习");
    }

    public void show(){
        System.out.println("name = " + name + ", age = " + getAge()); // 注意两个属性的访问权限
    }
}
