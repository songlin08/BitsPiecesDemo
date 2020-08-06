package com.lin.data_type;

/**
 * 写一个函数，2 个参数，1 个字符串，1 个字节数，返回截取的字符串，
 * 要求字符串中的中文不能出现乱码：如（“我 ABC”，4）应该截为“我 AB”，
 * 输入（“我ABC 汉 DEF”，6）应该输出为“我 ABC”而不是“我 ABC+汉的半个”
 */
public class StringDemo3 {

    public static String test(String str, int subBytes){
        int bytes = 0; //用来存储字符串的总字节数
        for (int i = 0; i < str.length(); i++){
            if (bytes == subBytes){
                return str.substring(0, i);
            }
            char c = str.charAt(i);
            if (c < 256){
                bytes += 1; // 英文字符的字节数看做1
            } else {
                bytes += 2; // 中文字符的字节数看做2
                if (bytes - subBytes == 1){
                    return str.substring(0, i);
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(test("我ABC",4));
        System.out.println(test("我ABC汉DEF",6));
    }
}
