package com.lin.data_type;

public class StringDemo {
    public static void main(String[] args) {
        String s = "hello world";
        String z = "good boy";

        char cc[] = {'h','e','l','l','o',' ','w','o','r','l','d','s'};
        String sss = String.valueOf("valueof(cc) : " +cc);  //valueof  把任何参数转换为String类型
        System.out.println(sss);

        System.out.println("charAt : " + s.charAt(4));  //返回指定下标的字符

        System.out.println("o所在的下标 ：" + s.indexOf("o"));   //返回字符所在下标,没有返回-1

        System.out.println("isEmpty : " + s.isEmpty());   //判断是否为空

        System.out.println("拼接字符串 ：" + s.concat(z));  //拼接字符串

        System.out.println("substring:" + s.substring(2,6));  //截取一个新字符串,6那一位拿不到

        System.out.println("字符替换o--s : " + s.replace("o", "s"));  //字符替换,把o换成s

        System.out.println("字母换成大写 : " + s.toUpperCase());  //字母换成大写,换成小写是toLowerCase()

        System.out.println("字符串长度 : " + s.length());  //返回字符串长度

        String as = "     kij   ki   k   ";
        System.out.println("去掉收尾的空格 : " + as.trim());  //去掉收尾的空格

        System.out.println("比较两字符字典顺序 : " + s.compareTo(z));  //比较两字符字典顺序

        System.out.println("contains : " + z.contains("g"));  //返回字符串中是否含有该字符

        System.out.println("判断两字符串是否相等 : " + s.equals(z));  //判断两字符串是否相等

        System.out.println("以特定字符划分成String数组 : ");
        String [] arr = s.split("o");   //以特定字符划分成String数组,把该字符去掉了
        for(String str:arr){
            System.out.print(str+" ");
        }
        System.out.println();

        char[] x = s.toCharArray();  //字符串转换为字符数组
        System.out.println("字符串转换为字符数组 : ");
        for(char ar:x){
            System.out.print(ar + "\t");  //"\t" 是空行
        }
    }
}
