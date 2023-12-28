package com.atguigu05._super.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05._super.exer3.Account
 * @Date: 2023年12月28日 11:20
 * @Description:
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;// 年利率

//    public Account() {
//    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月利率
     * @return 月利率
     */
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
     * 取款
     * @param amount 取款金额
     */
    public void withdraw (double amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    /**
     * 存款
     * @param amount 存款金额
     */
    public void deposit (double amount){
        if(amount>0){
            balance += amount;
        }
    }
}
