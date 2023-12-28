package com.atguigu05._super.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.exer2.Cylinder
 * @Date: 2023年12月27日 11:28
 * @Description:
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double findVolume() {
        return super.findArea() * getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public double findArea() {
        return Math.PI * getRadius()*getRadius() * 2 + Math.PI * getRadius() * 2 * getLength();
    }
}
