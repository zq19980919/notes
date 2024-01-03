package com.atguigu06.polymorphism.exer4;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.exer4.Exer4
 * @Date: 2024年01月03日 09:52
 * @Description:
 */
public class Exer4{
    public static void main(String[] args) {
        Exer4 exer4 = new Exer4();
        exer4.meeting(new Man(),new Woman(),new Man());
    }
    public void meeting(Person ... ps){
        for (Person p : ps) {
            p.eat();
            p.toilet();
            if (p instanceof Man) {
                ((Man) p).smoke();
            } else if (p instanceof Woman) {
                ((Woman) p).makeup();
            }

            System.out.println(" ");
        }
    }
}
