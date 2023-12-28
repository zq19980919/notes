package com.atguigu06.polymorphism;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.PersonTest1
 * @Date: 2023年12月28日 16:12
 * @Description:
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 不能直接调用子类特有的属性及方法
//        p1.earnMoney();
//        System.out.println(p1.isSmoking);

        // 向下转型
        Man m1 = (Man)p1;
        (m1).earnMoney();
        System.out.println(m1.isSmoking);
        System.out.println(p1 == m1); // p1和m1指向堆空间中的同一个对象

        /*
        * 向下转型可能会出现
        * */
        Person p2 = new Woman();
    }
}
