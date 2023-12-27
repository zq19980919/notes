package com.atguigu03._extends;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.ExtendsTest
 * @Date: 2023年12月27日 10:14
 * @Description:
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tony";
        p1.setAge(28);
        p1.eat();
        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Tom";
        s1.eat();
        s1.study();
        System.out.println(s1.getAge());

        System.out.println(s1.getClass().getSuperclass());
        System.out.println(p1.getClass().getSuperclass());
    }
}
