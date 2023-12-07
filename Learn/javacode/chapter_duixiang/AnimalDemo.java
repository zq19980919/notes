package Learn.javacode.chapter_duixiang;

/**
 * AnimalDemo
 */
public class AnimalDemo {

    /**
     * Animal
     */
    class Animal {
        public void eat() {
            System.out.println("动物吃东西");
        }
        public void work() {
            System.out.println("动物帮人干活");
        }
    }
    /**
     * Cat
     */
    class Cat extends Animal {
        public void eat() {
            System.out.println("猫吃鱼");
        }
        public void sleep() {
            System.out.println("猫睡懒觉");
        }
        
    }
    /**
     * Dog
     */
    class Dog extends Animal {
        public void eat() {
            System.out.println("狗吃骨头");
        }
    }
    /* 
    下述代码说明：当发生向上转型，去调用方法时，
    首先检查父类中是否有该方法，如果没有，
    则编译错误；如果有，再去调用子类的同名方法。
    如果子类没有同名方法，会再次去调父类中的该方法
    */
    public static void main(String[] args) {
        AnimalDemo ad = new AnimalDemo();
        Animal an = ad.new Animal();
        an.eat();
        an.work();
        System.out.println("----------");
        Animal c = ad.new Cat();
        c.eat();
        // cat.sleep(); 此处编译会报错
        // 父类引用指向子类对象，这种现象叫做："向上转型",也被称为多态的引用
        // 此时是另一只猫了，不是原来的那只猫了
        Cat c_real = (Cat)c;
        c_real.sleep();
        // 原来那只猫，只能干活，不能睡觉
        c.work();
        System.out.println("----------");
        Animal dog = ad.new Dog();
        dog.eat();
        dog.work();
    }
}