package com.lin.other;

public class 数组拼接 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,7,8,9,10};
        int[] c=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + "  ");
        }

    }
}
