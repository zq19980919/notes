package com.atguigu07_abstract;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07_abstract.Student
 * @Date: 2024年01月10日 16:09
 * @Description:
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void eat(){
        System.out.println("学生多吃有营养的饭");
    }

    @Override
    public void sleep(){
        System.out.println("学生要保持充足的睡眠");
    }

    @Override
    public void breath() {
        System.out.println("学生要多呼吸新鲜的空气");
    }
}
