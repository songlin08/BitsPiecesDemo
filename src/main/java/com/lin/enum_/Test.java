package com.lin.enum_;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String code = CodeStatus.SUCCESS.getCode();
        String mesg = CodeStatus.SUCCESS.getMesg();
        System.out.println("SUCCESS:  code:" + code + " ,mesg:" + mesg);

        code = CodeStatus.ERROR.getCode();
        mesg = CodeStatus.ERROR.getMesg();
        System.out.println("ERROR:   code:" + code + " ,mesg:" + mesg);

        //value()方法可以返回该枚举类的所有实例
        CodeStatus[] codes = CodeStatus.values();
        Arrays.asList(codes).forEach(System.out::println);
    }
}
