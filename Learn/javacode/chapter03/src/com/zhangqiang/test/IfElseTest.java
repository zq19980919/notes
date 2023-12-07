/*
 分支结构1：if-else条件判断结构
 1. 格式
 格式1:
 if(条件表达式){
    语句块1;
 }
 格式2:
 if(条件表达式){
    语句块
 }else{
    语句块2;
 }
 格式3:
 if(条件表达式1){
    语句块
 }elif(条件表达式2){
    语句块2;
 }
 ...
elif(条件表达式n){
    语句块n;
 }else{
    语句块n+1;
 }
*/
public class IfElseTest {
    public static void main(String[] args) {
       int heartBeats = 89;
       if(heartBeats< 60 || heartBeats>100){
        System.out.println("您需要进一步检查");
       }else{
        System.out.println("心率正常");
       }
       System.out.println("体检结束");
    }
}
