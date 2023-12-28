package com.atguigu05._super;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05._super.StudentTest
 * @Date: 2023年12月27日 16:15
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();

        s1.show();
        s1.show1();
        s1.show2();
        System.out.println("*******************");

        Student s2 = new Student("Tom",12);
        System.out.println(s2.name+" "+s2.getAge());


    }
}
