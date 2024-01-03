package com.atguigu07.object.equals.apply;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.equals.apply.CustomerTest
 * @Date: 2024年01月03日 13:13
 * @Description:
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 12, new Account(2000));
        Customer c2 = new Customer("Tom", 12, new Account(2000));


        System.out.println(c1.equals(c2));
    }
}
