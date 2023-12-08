package com.atguigu03.field_method.method.exer;
/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03.field_method.field.exer2.Employee
 * @Date: 2023年12月08日 14:57
 * @Description:
 */
public class Employee {
    // 属性
    int id; // 编号
    String name; // 姓名
    int age; // 年龄
    double salary; // 薪资

    // 定义一个方法，用于显示员工的信息
    public void show(){
        System.out.println("编号：" + id + "，姓名：" + name + "，年龄：" + age + "，薪资：" + salary);
    }
}
