package com.lin.data_type;

/**
 * Character是char的包装类 ， 用于对单个字符进行操作。
 */
public class CharacterDemo {
    public static void main(String[] args) {

        method1();

        method2();
    }

    public static void method1(){
        Character c1 = 'A';
        boolean bool = Character.isUpperCase(c1); //确定是否大写字母字符
        boolean lean = Character.isLowerCase(c1); //确定是否是小写字母字符
        System.out.println(c1 + " 是大写字母？ " + bool);
        System.out.println(c1 + " 是小写字母？ " + lean);
        char c2 = Character.toUpperCase('b'); //把小写字母换成大写
        char c3 = Character.toLowerCase('D'); //把大写字母换成小写
        System.out.println("b换成大写：" + c2);
        System.out.println("D换成小写：" + c3);

    }

    public static void method2(){
        char[] arr = {'a','b','c','d','&','1','2','3','$',};
        for (char c : arr) {
            if (Character.isLetter(c)){ //判断字符是否为字母
                System.out.println(c + "是字母");
            } else if(Character.isDigit(c)){ //判断字符是否为数字
                System.out.println(c + "是数字");
            } else{
                System.out.println(c + "是特殊符号");
            }
        }
        System.out.println("检验完毕！");
    }
}
