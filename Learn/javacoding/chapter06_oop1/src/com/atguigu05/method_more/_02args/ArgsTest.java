package com.atguigu05.method_more._02args;

import java.util.Arrays;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._02args.ArgsTest
 * @Date: 2023年12月15日 14:12
 * @Description:
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest a1 = new ArgsTest();
        a1.print();
    }
    public void print(int ... nums){
        System.out.println(Arrays.toString(nums));
    }
}
