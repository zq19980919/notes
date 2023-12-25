package com.auguigu09.bean_uml;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu09.bean_uml.User
 * @Date: 2023年12月25日 15:03
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age);

        User u2 = new User(2);
        System.out.println(u2.age);
    }
}
class User{
    String name;
    int age = 1;
    public User(){}
    public User(int a){
        age = a;
    }
}
