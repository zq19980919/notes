package com.atguigu04.example.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.example.exer1.PersonTest
 * @Date: 2023年12月15日 13:11
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 设置属性
        p1.name = "张张";
        p1.gender = '男';
        p1.age = 25;

        // 调用方法
        p1.study();
        int age = p1.showAge();
        System.out.println("age = " + age);
        p1.addAge(2);
        System.out.println(p1.age);
    }
}
