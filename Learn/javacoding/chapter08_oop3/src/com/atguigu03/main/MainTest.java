package com.atguigu03.main;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03.main.MainTest
 * @Date: 2024年01月04日 10:49
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {//程序入口
        String[] arr = {"AA", "BB", "CC"};
        Main.main(arr); // 调用Main类中的main方法

    }
}

class Main{
    public static void main(String[] args) { // 看作是普通静态方法
        System.out.println("Main中main方法的调用");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
