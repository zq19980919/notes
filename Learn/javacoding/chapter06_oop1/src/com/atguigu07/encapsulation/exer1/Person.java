package com.atguigu07.encapsulation.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.encapsulation.exer1.Person
 * @Date: 2023年12月18日 14:41
 * @Description:
 */
public class Person {
    // 属性
    private int age;

    // 方法

    public void setAge(int ag) {
        if (ag>=0 && ag <=130) {
            age = ag;
        }else{
            System.out.println("请输入合法年龄！");
        }
    }

    public int getAge() {
        return age;
    }
}
