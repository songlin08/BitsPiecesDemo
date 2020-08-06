package com.lin.design_patterns.factory_pattern.factory_method;

import com.lin.design_patterns.factory_pattern.MailSender;
import com.lin.design_patterns.factory_pattern.Sender;
import com.lin.design_patterns.factory_pattern.SmsSender;

/**
 * 2. 多个工厂方法模式
 * 该模式是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class MoreFactoryPattern {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        MoreFactoryPattern mfp = new MoreFactoryPattern();
        // 想创建哪个对象就调用哪个方法
        Sender sender = mfp.produceMail();
        sender.send();
    }
}
