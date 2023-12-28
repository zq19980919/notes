package com.atguigu05._super;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.atguigu05._super.Interview02
 * @Date: 2023年12月28日 13:46
 * @Description:
 */
public class Interview02 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();

        System.out.println("*****************");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();

    }
}
class Father{
    private String info = "atguigu";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class Son extends Father{
    private String info = "尚硅谷";

    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }

    public String getInfo() {
        return info;
    }



//    public void setInfo(String info) {
//        this.info = info;
//    }
}
