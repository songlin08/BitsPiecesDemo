package com.lin.design_patterns.single;
/**
 * 饿汉式单例模型,就是先给实例化一个对象,
 * 以后调用方法时就调用的这个对象,程序从始至终都是这一个对象
 */
public class SingleE {

    //私有的对象
    private static SingleE singleE = new SingleE(); //静态只调用一次

    //私有的构造方法
    private SingleE(){
        System.out.println("饿汉式单例模型");
    }

    //调用对象
    public static SingleE getInstance(){
        return singleE;
    }
}
