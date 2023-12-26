package com.atguigu01._this.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer1.Boy
 * @Date: 2023年12月26日 11:28
 * @Description:
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void marry(Girl girl){
        System.out.println("我要娶"+girl.getName());
//        girl.marry(this);
    }

    public void shout(){
        if(this.age >= 22){
            System.out.println("你可以去合法登记结婚了");
        }else{
            System.out.println("先多谈谈恋爱");
        }
    }
}
