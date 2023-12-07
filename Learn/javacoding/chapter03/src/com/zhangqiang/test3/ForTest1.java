package com.zhangqiang.test3;

/*
输出所有的水仙花数：3位数，其各位上数字立方和等于其本身
例如153 = 1*1*1+3*3*3+5*5*5
*/
public class ForTest1 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (i == Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3)) {
                System.out.println(i);
            }
        }
    }
}
