package com.auguigu08.constructor.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer3.Customer
 * @Date: 2023年12月25日 14:15
 * @Description:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account a) {
        account = a;
    }
}
