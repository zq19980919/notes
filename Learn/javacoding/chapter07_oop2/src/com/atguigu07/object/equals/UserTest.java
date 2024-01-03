package com.atguigu07.object.equals;

import java.io.File;
import java.util.Objects;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.object.equals.UserTest
 * @Date: 2024年01月03日 11:22
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);
        System.out.println(u1.equals(u2)); // false 重写后为true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        File file1 = new File("d:/a.txt");
        File file2 = new File("d:/a.txt");
        System.out.println(file1.equals(file2)); // true
        System.out.println(file1 == file2); // false

    }
}

class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals方法
//    @Override
//    public boolean equals(Object obj) {
//        // 1.判断是否是同一个对象
//        if (this == obj) {
//            return true;
//        }
//        // 2.判断是否是同一个类型
//        if (obj instanceof User user) {
//            // 4.比较属性
//            return this.name.equals(user.name) && this.age == user.age;
//        }
//        return false;
//    }

    // 快速实现
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}
