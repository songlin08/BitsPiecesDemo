package com.lin.enum_;

/**
 *  枚举类：是一种特殊的类
 *  SUCCESS("100","操作成功")可以理解为CodeStatus的一个对象，并在构造的时候传了两个值
 */
public enum CodeStatus {
    //枚举值必须要位于枚举类的第一个语句,不能放在后面
    SUCCESS("100","操作成功"),

    // 这句相当于 private static final CodeStatus ERROR = new CodeStatus("1002","对不起，操作失败");
    ERROR("1002","对不起，操作失败"),

    ;

    private String code;
    private String mesg;

    CodeStatus(String code, String mesg){
        this.code = code;
        this.mesg = mesg;
    }

    public String getCode() {
        return code;
    }

    public String getMesg() {
        return mesg;
    }
}
