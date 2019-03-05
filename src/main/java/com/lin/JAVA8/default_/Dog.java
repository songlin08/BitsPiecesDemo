package com.lin.JAVA8.default_;

public class Dog implements Animal {

    @Override
    public void play() {
        System.out.println("狗在玩足球");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        //这里没有重写eat(),所以输出的结果是Animal接口中的内容
        dog.eat();
    }
}
