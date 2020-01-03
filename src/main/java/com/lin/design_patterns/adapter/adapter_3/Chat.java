package com.lin.design_patterns.adapter.adapter_3;

/**
 * 提供聊天服务
 * 需要网络功能，所以只重写NET()方法
 */
public class Chat extends Wrapper {

    @Override
    public void NET() {
        System.out.println("Hello World，来自Chat类的NET()方法");
    }
}
