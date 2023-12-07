/**
 * SetValueTest
 * 测试运算符的使用2：赋值运算符
 * =，+=，-=，*=，/=，%=
 */
public class SetValueTest {

    public static void main(String[] args) {
        //连续赋值
        // 操作方式1
        int a1 = 10;
        int b1 = 10;
        // 操作方式2
        int a2, b2;
        a2 = b2 = 10;
        System.out.println(a2 + "," + b2);
        // 操作方式3
        int a3 = 10, b3 = 20;
        System.out.println(a3 + "," + b3);
        // ********************************
        // 说明+=的使用
        int m1 = 10;
        m1 += 5; //类似于m1 = m1 + 5;
        System.out.println(m1);

        byte by1 = 10;
        by1 += 5; //by1 = (byte)(by1 + 5);
        System.out.println(by1);

        int m2 = 1;
        m2 *= 0.1; // m2 = (int)(m2 * 0.1)
        System.out.println(m2);

        // ********************************
        //练习
        int nn = 10;
        nn += (nn++) + (++nn);
        System.out.println(nn); // 32
    }
}