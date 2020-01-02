package com.lin.design_patterns.adapter.adapter_2;

import com.lin.design_patterns.adapter.Source;
import com.lin.design_patterns.adapter.Targetable;

public class Wrapper implements Targetable{

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
