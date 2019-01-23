package com.lin.inner_class;

import com.lin.inner_class.InnerClassDemo3.Demo3;

public class Test {
    public static void main(String[] args) {
        //1.内部类
        //先实例化外部类,再由外部类来实例化内部类
        InnerClassDemo1 demo1 = new InnerClassDemo1();
        InnerClassDemo1.Demo2 demo2 =demo1.new Demo2();
        demo2.method();

        //2.静态内部类,和以前的没什么区别,可以直接实例化
        Demo3 demo3 = new Demo3();
        demo3.method();

        //3.匿名内部类
        //就是抽象类也可以实例化,只是实例化的同时要重写方法
        InnerClassDemo2 demo4 = new InnerClassDemo2() {
            void method() {

            }
        };
        demo4.me();
    }
}
