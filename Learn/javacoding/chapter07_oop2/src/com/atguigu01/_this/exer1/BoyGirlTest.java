package com.atguigu01._this.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer1.BoyGirlTest
 * @Date: 2023年12月26日 11:45
 * @Description:
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Tom",24);
        Girl girl1 = new Girl("Jerry",22);

        girl1.marry(boy1);
        boy1.shout();

        Girl girl2 = new Girl("翠花", 18);
        System.out.println(girl1.compare(girl2));
    }
}
