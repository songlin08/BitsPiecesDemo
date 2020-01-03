package com.lin.design_patterns.adapter.adapter_3;

/**
 * 定义抽象类实现Port接口，但是什么事情都不做
 */
public abstract class Wrapper implements Port{

    @Override
    public void SSH() {

    }

    @Override
    public void NET() {

    }

    @Override
    public void Tomcat() {

    }

    @Override
    public void MySQL() {

    }
}
