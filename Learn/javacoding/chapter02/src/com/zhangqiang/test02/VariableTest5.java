package com.zhangqiang.test02;

public class VariableTest5 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";
        String str3 = "a"; // char c1 = 'a' 根本是两种东西

        // 测试连接运算
        int num1 = 10;
        boolean boo1 = true;
        String str4 = "hello";
        System.out.println(str4 + boo1);

        //如何将String类型的变相转换为基本数据类型？
        int num2 = 9;
        String str5 = "abc";//不能考虑转换为基本数据类型
        String str6 = num2 + "";

        // 编译不通过
        //int num3 = (int)str6;
        int num3 =  Integer.parseInt(str6);
        System.out.println(num3+1);
    }
}
