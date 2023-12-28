package com.atguigu05._super.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05._super.exer3.CheckAccount
 * @Date: 2023年12月28日 13:20
 * @Description:
 */
public class CheckAccount extends Account{
    private double overdraft;// 可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对于可透支账户的取款
     * @param amount 取款金额
     */
    @Override
    public void withdraw (double amount){
        if(getBalance()>=amount){
            // 方式一：
            super.withdraw(amount);
        } else if (getBalance() +overdraft>=amount) {
            overdraft -= (amount - getBalance());
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额！");
        }
    }
}
