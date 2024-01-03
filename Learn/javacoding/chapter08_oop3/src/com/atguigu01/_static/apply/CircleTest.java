package com.atguigu01._static.apply;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._static.apply.CircleTest
 * @Date: 2024年01月03日 17:20
 * @Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle(2.3);
        System.out.println(c4);


    }
}

class Circle {
    double radius;
    int id;

    static int total; // 记录创建的圆的个数

    static int init = 1001; // static声明的属性被所有对象共享

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
