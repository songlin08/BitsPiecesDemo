package com.lin.other;

public class 打印菱形图像 {
    public static void main(String[] args) {
        int hs=9;
        int[] arr=new int[hs];
        for(int i=0;i<=hs/2;i++){
            int value=i*(i+1);
            arr[i]=value<1?1:value;//排除第一行为0 的情况
            arr[arr.length-i-1]=arr[i];  //倒序

        }
        System.out.print("新组成的数组为:{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i];j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
