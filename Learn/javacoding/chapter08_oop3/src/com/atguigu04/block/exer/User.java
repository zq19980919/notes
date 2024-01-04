package com.atguigu04.block.exer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.block.exer.User
 * @Date: 2024年01月04日 13:56
 * @Description:
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    public User() {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        userName = System.currentTimeMillis() + " ";
        password = "123456";
    }

    public User(String userName, String password) {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名：" + userName + ", 密码：" + password + ", 注册时间：" + registrationTime;
    }
}
