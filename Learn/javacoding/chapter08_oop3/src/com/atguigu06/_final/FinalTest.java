package com.atguigu06._final;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu06._final.FinalTest
 * @Date: 2024年01月09日 15:01
 * @Description:
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
//        e.MIN_SCORE = 10;
        E e1 = new E(10);
//        e1.LEFT = 11;

    }
}


final class A{}

//class B extends A{} // Cannot inherit from final 'com.atguigu06._final.A'
class C{
    public final void method(){
    }
}

class D extends C{
//    public void method(){
//    }
}

class E{
    final int MIN_SCORE = 0;
    final int MAX_SCORE;

    final int LEFT;
    {
        MAX_SCORE = 100;
    }

    public E(){
        LEFT = 2;
    }

    public E(int left){
        LEFT = left;
    }
}