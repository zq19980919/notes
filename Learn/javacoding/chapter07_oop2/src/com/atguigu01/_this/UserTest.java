package com.atguigu01._this;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.UserTest
 * @Date: 2023年12月26日 11:17
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        // 此处只有一个对象，但是调用了三次构造器
        User u1 = new User("张三",20);
    }
}
class User{
    String name;
    int age;
    public User(){}

    public User(String name){
        this();
        this.name = name;
    }
    public User(String name,int age){
//        this.name = name;
        this(name);
        this.age = age;
    }


}
