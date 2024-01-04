package com.atguigu04.block.exer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu04.block.exer.User1
 * @Date: 2024年01月04日 14:03
 * @Description:
 */
public class User1 {
    private String userName;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User1() {
        userName = System.currentTimeMillis() + " ";
        password = "123456";
    }

    public User1(String userName, String password) {
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
