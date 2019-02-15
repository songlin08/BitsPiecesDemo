package com.lin.other;

public class finally优先级 {

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static String method(){
        try {
            int i = 5/1;
            return "没有错误";
        } catch(Exception e){
            System.out.println("错误消息：" + e.getMessage());
            return "异常抛出，结束";
        }finally {
            System.out.println("finally");
            return "finally执行完毕";
        }
    }
}
