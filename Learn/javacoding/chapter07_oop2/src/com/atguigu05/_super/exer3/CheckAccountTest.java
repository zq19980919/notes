package com.atguigu05._super.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05._super.exer3.CheckAccountTest
 * @Date: 2023年12月28日 13:33
 * @Description:
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
    }
}
