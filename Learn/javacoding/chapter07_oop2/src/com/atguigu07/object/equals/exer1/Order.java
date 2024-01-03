package com.atguigu07.object.equals.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.equals.exer1.Order
 * @Date: 2024年01月03日 13:18
 * @Description:
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // 手写equals
    @Override
    public boolean equals(Object obj) {
        // 1.判断是否是同一个对象
        if (this == obj) {
            return true;
        }
        // 2.判断是否是同一个类型
        if (obj instanceof Order order) {
            // 3.比较属性
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}
