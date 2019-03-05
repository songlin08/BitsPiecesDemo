package com.lin.JAVA8.default_;

public interface Animal {

    void play();

    /**
     * 默认的方法
     */
    default void eat(){
        System.out.println("出自Animal: 它什么都吃！");
    }
}
