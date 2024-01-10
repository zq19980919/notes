package com.atguigu05.field;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.field.FieldTest
 * @Date: 2024年01月04日 14:53
 * @Description:
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}

class Order{
    int orderId = 1;

    {
        orderId = 2;
    }

    public Order() {
        orderId = 3;
    }

    public Order(int orderId){
        this.orderId = orderId;
    }
}
