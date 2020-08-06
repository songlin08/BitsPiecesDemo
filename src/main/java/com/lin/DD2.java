package com.lin;

public class DD2 extends DD1 {

    static {
        System.out.println("DD2静态代码块");
    }

    {
        System.out.println("DD2实例代码块");
    }

    public DD2() {
        System.out.println("DD2构造器");
    }

    public static void method(){
        System.out.println("DD2------静态方法执行");
    }


    public static void main(String[] args) {
        new DD2();
        System.out.println("-----");
        new DD2();
    }
}
