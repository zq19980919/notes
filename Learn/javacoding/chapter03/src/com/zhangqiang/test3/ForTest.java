package com.zhangqiang.test3;
/*
循环结构之一：for循环结构

1.Java中规范了3种循环结构：for、while、do-while
2.凡是循环结构，就一定会有4个要素：
    ①初始化条件
    ②循环条件（boolean类型）
    ③循环体
    ④迭代部分
3.for循环的格式：
    for(①;②;④){
        ③
    }

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
*/

public class ForTest {
    public static void main(String[] args) {
        // 需求：打印5次HelloWorld
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("HelloWorld");
        // }
        // 遍历100以内的偶数，并获取偶数的个数，获取所有偶数的和
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
            sum+=i;
            num++;
            }
        }
        System.err.println("100以内偶数个数为:"+num+"  100以内偶数之和为:"+sum);
    }
}
