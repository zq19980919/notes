package com.zhangqiang.test3; /**
随机产生3个1-6的整数，如果三个数相等，那么称为豹子，
如果三个数之和大于9，那么称为大，否则称为小
用户从键盘输入压的是“豹子”、“大”、“小”，并判断是否猜对了
**/
import java.util.Scanner;
/**
 * SwitchCasePra
 */
public class SwitchCasePra {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*6+1);
        int num2 = (int)(Math.random()*6+1);
        int num3 = (int)(Math.random()*6+1);
        boolean result = true;

        System.out.println("请猜测结果（豹子、大、小）：");
        Scanner input = new Scanner(System.in);
        String guess = input.next();
        input.close();
        switch (guess) {
            case "豹子":result = (num1 == num2 && num2 == num3);break;
            case "大":result = (num1 + num2 + num3 > 9);break;
            case "小":result = (num1 + num2 + num3 <= 9);break;
            default:System.out.println("输入错误");
            return;
        }
        System.out.println("结果是：" + num1 + " " + num2 + " " + num3);
        System.out.println(result?"恭喜你，猜对了":"很遗憾，猜错了");
    }
}