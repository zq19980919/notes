package com.auguigu08.constructor;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.PersonTest
 * @Date: 2023年12月25日 10:47
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建对象
        Person p1 = new Person(1);
        System.out.println(p1.age);

        p1.eat();
    }
}
