package com.lin.digui;

import java.util.Scanner;

/**
 *   递归求质数
 *   质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
 */
public class Zishu {
    public static void main(String[] args) {
           method();
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = scanner.nextInt();
        int count = test(a);
        if (count == 0){
            System.out.println(a + "是一个质数");
        }else{
            System.out.println(a + "不是质数");
        }
    }
    public static int count=0;
    public static int b=2;
    private static int test(int a) {
          if (b < a){
              if (a % b == 0){ //如果满足这个条件的话，代表a不是质数了，count就会增加
                  count++;
              }
              b++;
              test(a);
          }
          return count;
    }

}
