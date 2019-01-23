package com.lin.innerclass;

public class InnerClassDemo3 {

    public void me(){
        System.out.println("这是静态外部类方法");
    }

    public static class Demo3{
        public void method(){
            System.out.println("这是静态内部类,和外部类的方法一样");
        }
    }

}
