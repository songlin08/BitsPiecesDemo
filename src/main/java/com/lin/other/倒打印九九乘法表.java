package com.lin.other;

public class 倒打印九九乘法表 {
    public static void main(String[] args) {
        for(int i=9;i>0;i--){  //控制行数,从9开始

            for(int j=1;j<i;j++ ){
                System.out.print("\t");  //控制前面的空格
            }

            for(int j=9;j>=i;j--){
                System.out.print(j + "*" + i + "=" + i*j + "\t" );  //  \t等于个6个空格
            }
            System.out.println();  //  换行
        }

    }
}
