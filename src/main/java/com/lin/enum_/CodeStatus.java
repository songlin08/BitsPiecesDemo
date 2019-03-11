package com.lin.enum_;

/**
 *  枚举类：是一种特殊的类 ，实例（也叫对象）有限且固定不变的类，在Java里被称为枚举类。
 *  SUCCESS("100","操作成功")可以理解为CodeStatus的一个对象，并在构造的时候传了两个值
 */
public enum CodeStatus {
    //枚举类的所有实例必须在枚举类的第一行显示列出，否则这个枚举类永远都不可能产生实例。
    // 列出的这些实例，系统会自动给它们加上 public static final 修饰。
    // 枚举类的实例以逗号分隔，分号结束，这些列出的枚举值代表了该枚举类的所有可能的实例
    SUCCESS("100","操作成功"),

    // 这句相当于 private static final CodeStatus ERROR = new CodeStatus("1002","对不起，操作失败");
    ERROR("1002","对不起，操作失败"),

    ;

    private String code;
    private String mesg;

    //枚举类的构造器只能使用 private 访问控制符,默认private
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
