package com.lin;

public class DD1 {

    static {
        System.out.println("DD1静态代码块");
    }

    {
        System.out.println("DD1实例代码块");
    }

    public DD1() {
        System.out.println("DD1构造器");
    }

    public static void method(){
        System.out.println("DD1------静态方法执行");
    }
}
