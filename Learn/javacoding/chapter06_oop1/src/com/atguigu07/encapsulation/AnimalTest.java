package com.atguigu07.encapsulation;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu07.encapsulation.AnimalTest
 * @Date: 2023年12月18日 13:08
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "狗子";
        // 因为legs声明为private，是私有的，除了Animal这个类之外就不能调用了
//        animal1.legs = 4;
        // 只能通过setLegs方法间接的赋值
        animal1.setLegs(2);
//        System.out.println("name = "+ animal1.name + " legs = "+animal1.legs);
        System.out.println("name = "+ animal1.name + " legs = "+animal1.getLegs());
        animal1.eat();
    }
}
class Animal{
    // 属性
    String name;
    private int legs;

    // 方法

    //设置legs的属性值
    public void setLegs(int l) {
        if (l >=0 && l % 2 == 0) {
            legs = l;
        }else{
            System.out.println("请输入合法数据！");
        }
    }

    // 获取legs的属性值
    public int getLegs(){
        return legs;
    }


    public void eat() {
        System.out.println("动物觅食");
    }
}
