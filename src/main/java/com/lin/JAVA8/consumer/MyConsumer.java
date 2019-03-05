package com.lin.JAVA8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 自定义消费行为 Consumer
 * 1. 首先，需要实现 java.util.function.Consumer 接口；
 * 2. 再次，实现其 accept 方法
 */
public class MyConsumer implements Consumer<Object> {

    @Override
    public void accept(Object object) {
        System.out.println("MyConsumer -- out : " + object);
    }

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        for(int i=0; i<3; i++) {
            myList.add(i);
        }

        MyConsumer myConsumer = new MyConsumer();

        myList.forEach(myConsumer);

    }
}
