package com.auguigu09.bean_uml;

import java.util.Date;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu09.bean_uml.Customer
 * @Date: 2023年12月25日 15:33
 * @Description:
 */
public class Customer {
    private String name;
    private int id;
    public Customer(){};

    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
