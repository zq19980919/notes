package com.atguigu04.override.test1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.override.test1.Order
 * @Date: 2023年12月27日 13:07
 * @Description:
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate() {}

    void methodDefault() {}

    protected void methodProtected() {}

    public void methodPublic() {}

    public void show(){
        System.out.println(orderPrivate);
        System.out.println(orderDefault);
        System.out.println(orderProtected);
        System.out.println(orderPublic);

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
