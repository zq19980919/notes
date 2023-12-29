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
        * 向下转型可能会出现 ClassCastException 的异常
        * */
        Person p2 = new Woman();
//        Man m2 = (Man)p2;
//        m2.earnMoney();
//        System.out.println(m2.isSmoking);

       /*
       * 1 建议在向下转型之前，使用 instanceof 进行类型检查，避免出现 ClassCastException 的异常
       * 2 格式 a instanceof A：判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false
       * */
        if (p2 instanceof Man) {
            Man m2 = (Man)p2;
            m2.earnMoney();
        }
    }
}
