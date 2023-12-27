package com.atguigu03._extends.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.exer2.CylinderTest
 * @Date: 2023年12月27日 13:02
 * @Description:
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setLength(1.4);
        System.out.println("圆柱的体积为：" + cylinder.findVolume());
        cylinder.setLength(2.0);
        System.out.println("圆柱的体积为：" + cylinder.findVolume());
    }
}
