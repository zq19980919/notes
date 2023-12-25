package com.atguigu07.encapsulation.exer4.test1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.encapsulation.exer4.test1.Order
 * @Date: 2023年12月25日 10:25
 * @Description:
 */
public class Order {
    // 声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    // 声明不同权限的方法
    private void methodPrivate() {
    }
    void methodDefault() {
    }
    public void methodPublic() {
    }

    public void test(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
