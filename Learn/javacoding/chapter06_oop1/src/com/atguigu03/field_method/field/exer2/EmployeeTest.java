package com.atguigu03.field_method.field.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03.field_method.field.exer2.EmployeeTest
 * @Date: 2023年12月08日 15:00
 * @Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建Employee类的实例1
        Employee e1 = new Employee();
        e1.id = 1001;
        e1.name = "张强";
        e1.age = 18;
        e1.salary = 20000;
        e1.birthday = new MyDate();
        e1.birthday.year = 1998;
        e1.birthday.month = 9;
        e1.birthday.day = 19;

        System.out.println(e1.name + "的生日是" + e1.birthday.year + "年" + e1.birthday.month + "月" + e1.birthday.day + "日");
    }
}
