package com.atguigu04.example.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.example.exer1.Person
 * @Date: 2023年12月15日 13:07
 * @Description:
 * 创建Person类对象，设置该对象的name、age和gender属性；
 * 调用study方法，输出字符串“studying”；
 * 调用showAge()方法显示age值；
 * 调用addAge()方法给对象的age属性值增加addAge岁。
 */
public class Person {
    String name;
    int age;
    char gender;
    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age += addAge;
    }
}
