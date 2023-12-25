package com.auguigu08.constructor.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer1.Student
 * @Date: 2023年12月25日 11:05
 * @Description:
 */
public class Student {
    // 属性
    String name;
    int age;
    String major;
    String school;

    // 构造器
    public Student(String n, int a) {
        name = n;
        age = a;
    }
    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }
    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public String getInfo() {
        return "姓名：" + name + "年龄：" + age + "学校：" + school + "专业：" + major;
    }
}
