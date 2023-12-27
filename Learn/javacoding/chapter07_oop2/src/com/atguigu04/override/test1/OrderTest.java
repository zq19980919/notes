package com.atguigu04.override.test1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.override.test1.OrderTest
 * @Date: 2023年12月27日 13:09
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        //受封装性影响 private不能调用
        Order order = new Order();
        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        order.show();
    }
}
