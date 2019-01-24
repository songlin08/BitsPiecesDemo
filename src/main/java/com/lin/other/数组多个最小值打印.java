package com.lin.other;

public class 数组多个最小值打印 {
    public static void main(String[] args) {
        int[] arr={1,2,7,1,4,2,5,1,3,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }System.out.println("最小值:" + min);

        for(int i=0;i<arr.length;i++){
            if(min==arr[i]){
                System.out.println("下标为：" + i);
            }
        }

    }

}
