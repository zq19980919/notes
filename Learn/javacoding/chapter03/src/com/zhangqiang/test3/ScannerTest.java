package com.zhangqiang.test3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("名字是：" + name);
        scanner.close();
    }
}
