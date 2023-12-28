package com.atguigu06.polymorphism;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.PersonTest
 * @Date: 2023年12月28日 15:03
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        // 多态性之前的场景
        Person p1 = new Person();
        Man m1 = new Man();


        // 多态性之后的场景
        Person p2 = new Man();

        /*
         多态性的应用 虚拟方法调用

         在多态的场景下，调用方法时，编译看左边，运行看右边
         编译时，认为方法是左边声明的父类的类型的方法
         执行时，实际执行的是子类重写父类的方法
         */
        p2.eat();

        //属性是否满足多态性？
        System.out.println(p1.id);
        System.out.println(p2.id);

        //多态无法直接调用子类特有的属性及方法
//        p2.earnMoney();
    }
}
