package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.override.test2.OrderTest
 * @Date: 2023年12月27日 13:10
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        //不是子类，也不是同个包下，只能调用public
        Order order = new Order();
//        order.orderDefault = 1;
//        order.orderProtected = 2;
        order.orderPublic = 3;

//        order.methodDefault();
//        order.methodProtected();
        order.methodPublic();

        order.show();
    }
}
