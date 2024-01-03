package com.atguigu01._static;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._static.ChineseTest
 * @Date: 2024年01月03日 15:32
 * @Description:
 */
public class ChineseTest {
    public static void main(String[] args) {
        System.out.println(Chinese.nation);
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "刘翔";
        c2.age = 39;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c1.nation = "CHN";
        System.out.println(c1.nation);
        System.out.println(c2.nation);
    }

}

class Chinese {
    //非静态变量
    String name;
    //年龄
    int age;
    //身高


    //静态变量
    static String nation = "中国";


    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food){
        System.out.println("我喜欢吃"+food);
    }

    public static void method1(){
        System.out.println("我是静态的测试方法");
    }

    public static void show(){
        System.out.println("我是一个中国人");
//        eat(); 编译不通过
        System.out.println("nation = " + nation);
        method1();
    }
}
