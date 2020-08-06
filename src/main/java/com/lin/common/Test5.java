package com.lin.common;

/**
 *
 *
 */
public class Test5 {

    public static void main(String[] args) {
        // 1.中文汉字可以保存在char中，因为char占2个字节（byte）, 而一个汉字是一个字符，也是2个字节
        char a = '中';
        char b = '国';
        System.out.println(a);
        System.out.println(b);

        // 2.不过英文字母是一个字节，可以保存在byte中，而汉字不能。
        byte aa = 'a';
//        byte bb = '中'; // 这里编译会报错

        // 3.能不能把a和b拼接在一起一次性输出呢
        System.out.println(a + b);
            // 结果是42282，不是我们想要的结果，是我们误用了 “+”运算符，当 它被用于字符串之间时，或字符串于数字之间，产生的效果是字符串的拼接。
        // 但当它被用于字符和字符之间时，效果等同于数字和数字之间，是一种算术运算


    }
}
