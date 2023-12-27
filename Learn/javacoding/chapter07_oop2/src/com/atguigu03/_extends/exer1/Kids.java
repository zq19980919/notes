package com.atguigu03._extends.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.exer1.Kids
 * @Date: 2023年12月27日 10:46
 * @Description:
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex,int salary,int yearsOld) {
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }



    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + " years old.");
    }


}
