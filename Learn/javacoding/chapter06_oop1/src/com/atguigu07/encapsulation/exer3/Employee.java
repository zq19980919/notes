package com.atguigu07.encapsulation.exer3;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.encapsulation.exer3.Employee
 * @Date: 2023年12月18日 14:50
 * @Description:
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setGender(char g) {
        gender = g;
    }

    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfo(){
        return name + "\t" +gender+"\t"+age+"\t"+phoneNumber;
    }
    }
