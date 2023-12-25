package com.auguigu08.constructor.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer3.AccountTest
 * @Date: 2023年12月25日 13:57
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000, 2000, 1.23);
        Customer c1 = new Customer("Jane","Smith");
        c1.setAccount(account);
        c1.getAccount().deposit(100);
        c1.getAccount().withDraw(960);
        c1.getAccount().withDraw(2000);

        System.out.println("Customer[" + c1.getLastName() + "," + c1.getFirstName() + "] has a account: id is " + c1.getAccount().getId() + ", annualInterestRate is " + c1.getAccount().getAnnualInterestRate() * 100 + "%, balance is " + c1.getAccount().getBalance());
    }
}
