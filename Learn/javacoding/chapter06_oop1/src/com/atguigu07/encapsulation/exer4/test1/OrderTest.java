package com.atguigu07.encapsulation.exer4.test1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.encapsulation.exer4.test1.OrderTest
 * @Date: 2023年12月25日 10:30
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderDefault = 1;
        order.orderPublic = 2;
//        order.orderPrivate = 3;
        //调用方法
        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();

    }
}
