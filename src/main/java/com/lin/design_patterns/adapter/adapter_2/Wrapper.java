package com.lin.design_patterns.adapter.adapter_2;

import com.lin.design_patterns.adapter.Source;
import com.lin.design_patterns.adapter.Targetable;

public class Wrapper implements Targetable{

    // 持有Source 类的实例，以达到解决兼容性的问题
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method...");
    }
}
