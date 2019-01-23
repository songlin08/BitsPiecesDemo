package com.lin.data_type;

public class StringBufferDemo {
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer();//定义了一个空的对象
        StringBuffer sb = new StringBuffer("12345678");
        System.out.println(sb);

//		StringBuffer s = "abc";  //赋值类型不匹配
//      StringBuffer s = (StringBuffer)”abc”; //不存在继承关系，无法进行强转

        String sb2s = sb.toString(); //StringBuffer转换为String

        System.out.println(sb.append("good")); //字符串的连接

        System.out.println(sb.insert(2,"boy"));//插入字符串,参数是下标和插入值

        System.out.println(sb.delete(2, 4));//删除字符串,从下标为2开始,到4结束,不包括4

        //System.out.println(sb.reverse());   //字符串反转

        sb.setCharAt(0, 'A');  //把指定位置字符替换掉
        System.out.println(sb);

        System.out.println(sb.replace(3, 10,"hello"));  //不包括5


    }
}
