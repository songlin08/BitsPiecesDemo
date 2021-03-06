package com.lin.design_patterns.factory_pattern.factory_method;

import com.lin.design_patterns.factory_pattern.MailSender;
import com.lin.design_patterns.factory_pattern.Sender;
import com.lin.design_patterns.factory_pattern.SmsSender;

/**
 * 3. 静态工厂方法模式
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class StaticFactoryPattern {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = StaticFactoryPattern.produceMail();
        sender.send();
    }
}
