package com.lin.design_patterns.single;
/**
 * 饱汉式单例模型,就是先申明一个对象,但是不给创建,等调用方法时才创建
 * @author lin-f
 *
 */
public class SingleBao {

    //私有的成员变量
    private static SingleBao singleBao = null;

    //私有的构造方法
    private SingleBao(){
        System.out.println("饱汉式单例模型");
    }

    //对外的静态方法，获得对象
    public static SingleBao getInstance(){
        //先判断有没有对象，没有再创建
        if (singleBao == null){
            singleBao = new SingleBao();
        }
        return singleBao;
    }
}
