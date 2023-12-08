package com.atguigu03.field_method.field.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03.field_method.field.exer2.MyDate
 * @Date: 2023年12月08日 14:33
 * @Description: 用于生成日期对象的类，有属性：年year,月month,日day
 */
public class MyDate {
    // 属性
    int year;// 年
    int month;// 月
    int day;// 日

    // 方法
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
