package com.atguigu06.polymorphism.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer1.GeometricTets
 * @Date: 2024年01月01日 14:20
 * @Description:
 */
public class GeometricTest {

    public static void main(String[] args) {
        // 创建两个圆对象
        Circle c1 = new Circle("white",1.0,2.3);
        Circle c2 = new Circle("white",1.0,3.3);
        // 判断面积是否相等
        GeometricTest test = new GeometricTest();

        // 此处的GeometricObject是父类，c1和c2是子类，因此可以传入，体现多态性
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean isEquals = test.equalArea(c1, c2);
        System.out.println("c1和c2的面积是否相等：" + isEquals);

    }

    /**
     * 判断两个对象的面积是否相等
     * @param o1 几何对象1
     * @param o2 几何对象2
     */
    public boolean equalArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o) {// GeometricObject o = new Circle();
        System.out.println("面积为：" + o.findArea()); // 动态绑定 <---> 静态绑定
    }
}
