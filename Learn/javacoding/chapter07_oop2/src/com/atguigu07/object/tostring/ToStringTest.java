package com.atguigu07.object.tostring;

import java.io.File;
import java.util.Date;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.tostring.ToStringTest
 * @Date: 2024年01月03日 13:37
 * @Description:
 */
public class ToStringTest {
    public static void main(String[] args) {
        User user = new User("Tom", 12);
        System.out.println(user.toString());
        System.out.println(user);

        String s1 = "abc";
        System.out.println(s1.toString());

        File file = new File("D:\\a.txt");
        System.out.println(file.toString());

        Date date = new Date();
        System.out.println(date.toString());
    }

}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
