package com.atguigu07.object.tostring.exer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.tostring.exer.GeometricObject
 * @Date: 2024年01月03日 13:50
 * @Description:
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double findArea() {
        return 0.0;
    }
}
