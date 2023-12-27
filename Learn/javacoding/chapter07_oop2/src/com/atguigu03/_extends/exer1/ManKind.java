package com.atguigu03._extends.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.exer1.ManKind
 * @Date: 2023年12月27日 10:40
 * @Description:
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        // 三目运算符判断
        System.out.println(sex == 1?"man":"woman");
    }
    public void employeed(){
        // 三目运算符判断
        System.out.println(salary == 0?"no job":"job");
    }
}
