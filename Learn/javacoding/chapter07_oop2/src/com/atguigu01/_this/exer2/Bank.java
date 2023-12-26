package com.atguigu01._this.exer2;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer2.Bank
 * @Date: 2023年12月26日 13:19
 * @Description:
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param f
     * @param l
     */
    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
//        customers[numberOfCustomer] = customer;
//        numberOfCustomer++; 或者
        customers[numberOfCustomer++] = customer;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 返回指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if(index >= 0 && index < numberOfCustomer){
            return customers[index];
        }
        return null;
    }
}
