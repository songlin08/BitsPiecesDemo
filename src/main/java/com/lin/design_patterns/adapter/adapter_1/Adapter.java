package com.lin.design_patterns.adapter.adapter_1;

import com.lin.design_patterns.adapter.Source;
import com.lin.design_patterns.adapter.Targetable;

/**
 *  1. 类的适配器模式
 *
 * 新定义个类，实现Targetable的两个方法，
 * 由于继承了Source(已经实现了method1)，所以只需要实现method2()
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("This is the targetable method...");
    }
}
