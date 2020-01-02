package com.lin.design_patterns.factory_pattern.factory_method;

import com.lin.design_patterns.factory_pattern.MailSender;
import com.lin.design_patterns.factory_pattern.Sender;
import com.lin.design_patterns.factory_pattern.SmsSender;

/**
 * 1. 普通工厂模式
 * 建立一个工厂类，对实现了同一接口的一些类同时进行实例的创建。
 */
public class SingleFactoryPattern {

    public static void main(String[] args) {
        Sender sender = SingleFactoryPattern.produce("sms");
        sender.send();
    }

    /**
     * 在一个方法中，通过str的不同，判断创建不同的对象
     */
    public static Sender produce(String str){
        if ("mail".equals(str)){
            return new MailSender();
        } else if ("sms".equals(str)){
            return new SmsSender();
        } else {
            System.out.println("输入错误");
            return null;
        }
    }
}
