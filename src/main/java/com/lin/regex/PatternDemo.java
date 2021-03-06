package com.lin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern类的作用在于编译正则表达式后创建一个匹配模式.
 * 由于Pattern的构造函数是私有的,不可以直接创建,所以通过静态方法compile(String regex)（简单工厂方法）方法来创建,
 * 将给定的正则表达式编译并赋予给Pattern类
 */
public class PatternDemo {

    public static void main(String[] args) {
        String regex = "[\u4e00-\u9fa5]";
        Pattern pattern = Pattern.compile(regex);

        String patternStr = pattern.pattern(); //返回正则表达式的字符串形式,其实就是返回Pattern.complile(String regex)的regex参数
        System.out.println("1.patternStr : " + patternStr);

        Matcher matcher = pattern.matcher( "hello 今天天气好");

        //matches()是全部匹配，是将整个输入串与模式匹配，如果要验证一个输入的数据是否为数字类型或其他类型，一般要用matches()。
        System.out.println("2.matcher.matches : " + matcher.matches()); //结果为false hello 没有匹配上

        //find()方法是部分匹配，是查找目标串中与模式匹配的子串，如果该匹配的串有组还可以使用group()函数
        System.out.println("3.matcher.find() : " + matcher.find()); //结果为true 真好 被匹配上了


        /**
         * 当使用matches(),lookingAt(),find()执行匹配操作后,就可以利用以上三个方法得到更详细的信息.
            start()返回匹配到的子字符串在字符串中的索引位置.
            end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置.
            group()返回匹配到的子字符串
         */
        System.out.println("4.matcher.group()" + matcher.group()); //结果为： 今  返回group(0)

        //Pattern.matcher(String regex,CharSequence input)是一个静态方法,用于快速匹配字符串,该方法适合用于只匹配一次,且匹配全部字符串.
        System.out.println("5.Pattern.matches : " + Pattern.matches( "\\d+","123")); //结果为true
        System.out.println("6.Pattern.matches : " + Pattern.matches( "\\d+","123aaa"));  //结果为false







    }
}
