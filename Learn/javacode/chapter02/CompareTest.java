/* 
测试运算符的使用3:比较运算符
1. == != > < >= <= instanceof
2. instanceof在面向对象的多态性的位置讲解

*/
public class CompareTest {
    public static void main(String[] args) {
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1); // false

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 == n2); // false
        System.out.println(n1 = n2); // 20

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2); // false
        System.out.println(b1 = b2); // true
    }
}
