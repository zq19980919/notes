package com.atguigu01._static.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._static.exer1.AccountTest
 * @Date: 2024年01月03日 17:39
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println(acct1);

        Account acct2 = new Account("123456", 2000);
        System.out.println(acct2);

        Account.setInterestRate(0.0123);
        Account.setMinMoney(10);

        System.out.println("银行存款利率为"+Account.getInterestRate());
        System.out.println("银行最小存款额度为"+Account.getMinMoney());


    }
}
