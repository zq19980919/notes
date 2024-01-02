package com.atguigu06.polymorphism.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer3.InstanceTest
 * @Date: 2024年01月02日 09:43
 * @Description:
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());

        System.out.println("****************");

        test.method(new Graduate());

        System.out.println("****************");

        test.method(new Person());
    }


    public void method(Person e) {
        System.out.println(e.getInfo());
        // instanceof关键字的使用
        // a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
        if (e instanceof Graduate) {
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        } else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        } else {
            System.out.println("a person");
        }

        // 错误的写法！编译不通过！
        // if( e instanceof Student){
        //     System.out.println("a student");
        // }else if(e instanceof Person){
        //     System.out.println("a person");
        // }else if(e instanceof Graduate){
        //     System.out.println("a graduate student");
        // }
    }
}

