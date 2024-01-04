package com.atguigu02.singleton;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu02.singleton.BankTest
 * @Date: 2024年01月04日 10:04
 * @Description:
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

//饿汉式单例模式
class Bank{
    //1.私有化类的构造器
    private Bank(){
    }
    //2.内部创建类的实例
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态方法，返回类的实例
    public static Bank getInstance(){
        return instance;
    }
}
