package com.atguigu01._this.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer2.Account
 * @Date: 2023年12月26日 13:05
 * @Description: 账户类
 */
public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("成功存入"+amt);
        }
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("取款成功");
        }else{
            System.out.println("余额不足");
        }
    }
}
