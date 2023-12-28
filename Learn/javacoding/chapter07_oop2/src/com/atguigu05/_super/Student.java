package com.atguigu05._super;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.Student
 * @Date: 2023年12月27日 10:12
 * @Description:
 */
public class Student extends Person {
    String school;
    int id = 1002;//学号

    public Student(){
        super();
        System.out.println("Student()...");
    }

    public Student(String name, int age) {
        super(name, age);
    }



    public void study(){
        System.out.println("学生学习");
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void sleep(){
        System.out.println("学生需要足够的睡眠");
    }

    public void show(){
        super.eat();
    }

    public void show1(){
        doSport();
        super.doSport();
    }

    public void show2(){
        super.id = 1003;
        System.out.println("学号为：" + id);
        System.out.println("身份证号为：" + super.id);
    }
}
