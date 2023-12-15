package com.atguigu04.example.exer4;

import java.util.Arrays;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.example.exer4.MyArrays
 * @Date: 2023年12月15日 13:25
 * @Description:
 * 自定义Array工具类，相关方法为求最大值，最小值，总和，平均数，遍历数组，复制数组，数组反转，排序，查找等
 */
public class MyArrays {
    /**
     * 获取int数组的最大值
     */
    public int getMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
