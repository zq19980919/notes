package com.zhangqiang.test02;

/*
测试运算符的使用6：条件运算符

1. (条件表达式)?表达式1:表达式2
2. 说明：
①条件表达式的结果是boolean类型。
②条件表达式结果为true执行表达式1，否则执行表达式2
*/
public class ConditionTest {
    public static void main(String[] args) {
        String info = (2>10)? "表达式1":"表达式2";
        System.out.println(info);

        double result = (2>1)? 1:2.0;
        System.out.println(result);
    }
}
