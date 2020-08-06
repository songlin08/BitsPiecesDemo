package com.lin.design_patterns.factory_pattern.abstract_factory;

import com.lin.design_patterns.factory_pattern.MailSender;
import com.lin.design_patterns.factory_pattern.Sender;
import com.lin.design_patterns.factory_pattern.SmsSender;

/**
 * 抽象工厂模式
 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要扩展程序，必须对工厂类进行修改，
 这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？

 那么这就用到了抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，
 直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class FactoryPattern {

    public static void main(String[] args) {
        SendMailFactory sendMailFactory = new SendMailFactory();
        Sender sender = sendMailFactory.produce();
        sender.send();
    }
}


class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}

class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
