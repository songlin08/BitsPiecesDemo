package com.lin.inner_class;

public class InnerClassDemo1 {
    String name = "张三";

    public void me(){
        System.out.println("这是外部类,内部类的对象不能调用,因为是同级,不过可以放在内部类里面被调用");
    }

    public class Demo2{
        public void method(){
            me();
            System.out.println("这是内部类Demo2  外部类的属性名字:" + name);
        }
    }


}
