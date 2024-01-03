package com.atguigu07.object.equals.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.equals.exer1.OrderTest
 * @Date: 2024年01月03日 13:29
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001, "AA");
        Order o2 = new Order(1001, "AA");
        System.out.println(o1.equals(o2)); // true
    }
}
