package com.lin.other;

/**
 *   如果a为null
      a = null;
      a.equals("")出错nullPointerException
      如果写为"".equals(a)-->就可以防止nullPointerException啦
 */
public class equals防止空指针 {

    public static void main(String[] args) {
        String a = null;
        //System.out.println(A.equals(""));
        System.out.println("".equals(a));
    }
}
