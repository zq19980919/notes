package com.atguigu01._this.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer2.BankTest
 * @Date: 2023年12月26日 15:30
 * @Description:
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("操","曹");
        bank.addCustomer("备","刘");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);
        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}
