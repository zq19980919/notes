package com.auguigu08.constructor.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer3.Account
 * @Date: 2023年12月25日 13:39
 * @Description:
 */
public class Account {
    private int id; // 账号
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    // 构造器
    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a / 100;
    }
    public Account() {

    }

    // 方法
    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double a) {
        annualInterestRate = a / 100;
    }

    // 取钱
    public void withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        } else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
