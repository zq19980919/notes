package com.atguigu01._this;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.PersonTest
 * @Date: 2023年12月26日 10:48
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);
        p1.sleep();
    }
}
class Person{
    String name;
    int age;
    String email;

    public Person(){
    }

    public Person(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age; // 可加可不加
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
        this.eat();
    }
}