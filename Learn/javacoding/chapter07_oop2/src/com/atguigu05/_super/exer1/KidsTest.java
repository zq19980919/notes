package com.atguigu05._super.exer1;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu03._extends.exer1.KidsTest
 * @Date: 2023年12月27日 10:50
 * @Description:
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids();
        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //来自父类声明
        kid.manOrWoman();
        kid.employeed();

        //自己声明
        kid.printAge();
    }
}
