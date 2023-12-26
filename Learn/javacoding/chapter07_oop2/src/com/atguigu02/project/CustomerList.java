package com.atguigu02.project;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu02.project.CustomerList
 * @Date: 2023年12月26日 16:20
 * @Description: 为Customer对象的管理模块，内部使用数组管理一组Customer对象
 */
public class CustomerList {
    private Customer[] customers; // 用来保存客户对象的数组
    private int total = 0; // 记录已保存客户对象的数量

/**
     * 用途：用来初始化customers数组的构造器
     * @param totalCustomer：指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加组中最后一个客户对象记录之后
     * @param customer 指定要添加的客户对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if (total<customers.length){
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * @param index 指定所替换对象在数组中的位置，从0开始
     * @param cust 指定替换的新客户对象
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if (index<0 || index>=total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * @param index 指定所删除对象在数组中的索引位置，从0开始
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index){
        if (index<0 || index>=total){
            return false;
        }
        for (int i = index; i < total-1; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 用途：返回数组中记录的所有客户对象
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
//        for (int i = 0; i < total; i++) {
//            custs[i] = customers[i];
//        } 或者
        System.arraycopy(customers, 0, custs, 0, total);
        return custs;
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * @param index 指定所要获取的客户在数组中的索引位置，从0开始
     * @return 如果找到了元素，则返回；没有找到则返回null
     */
    public Customer getCustomer(int index){
        if (index<0 || index>=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 用途：返回当前所有客户的数量
     * @return 所有客户的数量
     */
    public int getTotal() {
        return total;
    }
}
