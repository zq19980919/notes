package com.atguigu01._this.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu01._this.exer1.Girl
 * @Date: 2023年12月26日 11:31
 * @Description:
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
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

    public void marry(Boy boy){
        System.out.println("我要嫁给"+boy.getName());
        boy.marry(this);
    }


    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
        if (this.age > girl.age) {
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }
    }
}
