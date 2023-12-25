package com.auguigu08.constructor.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer2.TriAngle
 * @Date: 2023年12月25日 13:24
 * @Description:
 */
public class TriAngle {
    // 属性
    private double base;
    private double height;

    // 构造器
    public TriAngle(double b, double h){
        base = b;
        height = h;
    }

    public TriAngle(){}

    // 通用方法
    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getArea(){
        return height * base /2;
    }
}
