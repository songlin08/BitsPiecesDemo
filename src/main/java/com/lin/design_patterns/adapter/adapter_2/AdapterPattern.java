package com.lin.design_patterns.adapter.adapter_2;

import com.lin.design_patterns.adapter.Source;
import com.lin.design_patterns.adapter.Targetable;

/**
 * 2. 对象的适配器模式
 *
 * 基本思路和类的适配器模式相同，只是将Adapter 类作修改，
 * 这次不继承Source 类，而是持有Source 类的实例，以达到解决兼容性的问题。
 */
public class AdapterPattern {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);

        targetable.method1();
        targetable.method2();
    }
}
