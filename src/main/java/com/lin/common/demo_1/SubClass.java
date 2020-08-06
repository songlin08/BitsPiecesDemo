package com.lin.common.demo_1;

/**
 * 属性值的覆盖问题
 */
public class SubClass extends ParentClass {

    public int i = 30;

    public static void main(String[] args) {

        ParentClass parentClass = new SubClass();
        SubClass  subClass = new SubClass();
        // 属性的值取父类还是子类并不取决于我们创建对象的类型，而是取决于我们定义的变量的类型

        // 所以这里是取的父类的属性，因为定义的时候定义的是父类
        System.out.println("1:" + parentClass.i);

        // 这里毫无疑问，取的是子类的属性
        System.out.println("2:" + subClass.i);
    }
}
