package com.atguigu05.method_more._02args.exer;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05.method_more._02args.exer.StringConCatTest
 * @Date: 2023年12月15日 14:33
 * @Description:
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest stringConCatTest = new StringConCatTest();
        String tmp = stringConCatTest.concat("-","hello","world");
        System.out.println(tmp);
        String tmp2 = stringConCatTest.concat("-");
        System.out.println(tmp2);
    }
    public String concat(String operator,String ... strs){
        String tmp = "";
        for (int i = 0; i < strs.length ; i++) {
            if (i == 0) {
                tmp += strs[i];
            }else {
                tmp += (operator+strs[i]);
            }
        }
        return tmp;
    }
}
