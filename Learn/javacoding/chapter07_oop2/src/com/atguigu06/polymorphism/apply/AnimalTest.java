package com.atguigu06.polymorphism.apply;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06.polymorphism.apply.AnimalTest
 * @Date: 2023年12月28日 15:25
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Dog());
        test.adopt(new Cat());
    }
    public void adopt(Animal animal){
        animal.eat();
        animal.jump();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("后空翻");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}