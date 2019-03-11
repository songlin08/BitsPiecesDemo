package com.lin.enum_;

public class Test {

    public static void main(String[] args) {
        String code = CodeStatus.SUCCESS.getCode();
        String mesg = CodeStatus.SUCCESS.getMesg();
        System.out.println("SUCCESS:  code:" + code + " ,mesg:" + mesg);

        code = CodeStatus.ERROR.getCode();
        mesg = CodeStatus.ERROR.getMesg();
        System.out.println("ERROR:   code:" + code + " ,mesg:" + mesg);
    }
}
