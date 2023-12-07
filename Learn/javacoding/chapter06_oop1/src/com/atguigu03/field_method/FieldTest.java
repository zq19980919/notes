package com.atguigu03.field_method;

public class FieldTest {
    public static void main(String[] args) {

    }
}
class Person{
    // 属性(或成员变量)
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        String food = "烙饼";// food是局部变量，只能在方法中使用
        // name是成员变量，可以在方法中直接使用，不需要声明
        System.out.println(name + "吃" + food);
    }
    public void sleep(int hour){// 形参hour属于局部变量
        System.out.println("人不能少于" + hour + "小时的睡眠");
    }
}
