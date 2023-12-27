package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.override.test2.SubOrder
 * @Date: 2023年12月27日 13:12
 * @Description:
 */
public class SubOrder extends Order {

    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法,但是可以调用声明为protected和public的属性、方法
//        orderDefault = 3;
//        methodDefault();
//        orderPrivate = 4;
//        methodPrivate();
    }
}
