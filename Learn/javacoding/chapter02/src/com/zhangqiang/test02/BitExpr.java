package com.zhangqiang.test02;
/*
 如何交换两个int型变量的值？String呢

*/

public class BitExpr {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m="+m+",n="+n);

        // 交换两个变量的值
        // 方式1：声明一个中间变量（推荐）
        // int temp = m;
        // m = n;
        // n = temp;

        // 方式2：优点：不需要定义临时变量。 缺点：适用性差
        // m = m + n;//30=10+20
        // n = m - n;//10=30-20 
        // m = m - n;//20=30-10
        
        // 方式3：
        m = m^n;
        n = m^n;// (m^n)^n---> m
        m = m^n;
        System.out.println("m="+m+",n="+n);
    }
}
