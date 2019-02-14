package com.lin.design_patterns.single;

public class Test {
    public static void main(String[] args) {
        SingleBao singleBao = SingleBao.getInstance();
        SingleBao singleBao2 = SingleBao.getInstance();
        System.out.println(singleBao);
        System.out.println(singleBao2);//发现两个对象是同一个
        System.out.println("------------");
        SingleE singleE = SingleE.getInstance();
        SingleE singleE2 = SingleE.getInstance();
        System.out.println(singleE);
        System.out.println(singleE2);//同样是同一个对象

    }
}
