package com.atguigu03.field_method.method;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03.field_method.method.MethodTest
 * @Date: 2023年12月08日 15:35
 * @Description:
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.eat();
    }
}
class Person{
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        String food = "烙饼";
        System.out.println(name + "吃" + food);
    }
}
