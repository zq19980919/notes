package com.atguigu05.method_more._03valuetransfer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._03valuetransfer.ValueTransferTest3
 * @Date: 2023年12月16日 15:20
 * @Description:
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = "+data.m+" n = " +data.n);
        ValueTransferTest3 t3 = new ValueTransferTest3();
        t3.swap(data);
        System.out.println("m = "+data.m+" n = " +data.n);
    }
    public void swap(Data data){
        int tmp = data.m;
        data.m = data.n;
        data.n = tmp;
    }
}
class Data{
    int m;
    int n;
}
