package com.lin.JAVA8.default_;

public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("猫在捉老鼠");
    }

    /**
     * Animal默认的方法,在这里被重写
     */
    @Override
    public void eat() {
        System.out.println("重写方法eat:猫吃猫粮");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
