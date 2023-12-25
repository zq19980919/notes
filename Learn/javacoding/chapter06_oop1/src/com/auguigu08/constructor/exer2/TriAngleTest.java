package com.auguigu08.constructor.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer2.TriAngleTest
 * @Date: 2023年12月25日 13:29
 * @Description:
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle(1.0, 1.0);
        System.out.println("底边长为"+t1.getBase()+"，高为"+t1.getHeight());
        System.out.println("三角形面积为"+t1.getArea());

        TriAngle t2 = new TriAngle();
        t2.setBase(2.0);
        t2.setHeight(2.0);
        System.out.println("底边长为"+t2.getBase()+"，高为"+t2.getHeight());
        System.out.println("三角形面积为"+t2.getArea());
    }
}
