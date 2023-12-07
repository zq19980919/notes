package com.zhangqiang.test02;/*
 今天是周2，10天以后是周几？

 要求：控制台输出“今天是周2，10天以后是周X”。
*/

public class ConditionExpr {
    public static void main(String[] args) {
        int week = 4;
        week += 10;
        week %=7;
        System.out.println("今天是周2,10天之后是周"+((week==0)?("日"):week));
    }
}
