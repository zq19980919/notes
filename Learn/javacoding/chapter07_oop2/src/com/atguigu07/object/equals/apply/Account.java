package com.atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.equals.apply.Account
 * @Date: 2024年01月03日 13:10
 * @Description:
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) { // 重写equals方法
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }
}
