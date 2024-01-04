package com.atguigu04.block;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.block.BlockTest
 * @Date: 2024年01月04日 11:51
 * @Description:
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.desc);
        System.out.println(Person.desc);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);
//        p1.eat();
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }

    // 静态代码块
    static {
        System.out.println("静态代码块1");
    }


}
