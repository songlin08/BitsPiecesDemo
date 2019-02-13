package com.lin.design_patterns.builder;

/**
 *   建造者模式，java23种设计模式之一
 */
public class BuildersDemo {

    /**
     * 静态方法，通过类名直接获得匿名对象
     * @return
     */
    public static TagBuilder newTagBuilder(){
        return new TagBuilder();
    }


}
