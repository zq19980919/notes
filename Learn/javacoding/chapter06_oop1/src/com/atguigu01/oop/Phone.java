package com.atguigu01.oop;

public class Phone {
    // 属性
    String name;//品牌
    double price;//价格

    //方法
    public void call() {
        System.out.println("手机能够拨打电话");
    }
    public void sendMessage(String message) {
        System.out.println("发送信息"+message);
    }

    public void playGame(String game){
        System.out.println(game +"启动！");
    }
}
