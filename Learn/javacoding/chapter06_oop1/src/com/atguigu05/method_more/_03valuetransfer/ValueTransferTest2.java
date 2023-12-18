package com.atguigu05.method_more._03valuetransfer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._03valuetransfer.ValueTrasferTest2
 * @Date: 2023年12月16日 15:15
 * @Description:
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        ValueTransferTest2 t2 = new ValueTransferTest2();

        System.out.println("m = "+m+" n = " +n);
        // 交换两个变量的值
//        int tmp = m;
//        m = n;
//        n = tmp;
        t2.swap(m,n);
        System.out.println("m = "+m+" n = " +n);// 结果仍然不变，这是因为传递的是值
    }

    public void swap(int m, int n){
        int tmp = m;
//        m = n;
//        n = tmp;
    }
}
