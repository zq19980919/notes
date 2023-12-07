package com.zhangqiang.test3;

/**
分支结构SwtichCase的使用
1.语法格式
switch(表达式){
   case 常量值1;
   语句块1;
   // break;
   case 常量值2;
   语句块2;
   // break;
   // ...
   [default:
   语句块n+1;
   /break;]
}
 */
public class SwtichCaseTest {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("zero");
                break;            
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("other");
        }
    }
}