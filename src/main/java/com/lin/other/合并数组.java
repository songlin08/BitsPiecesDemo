package com.lin.other;

/**
 * a数组的第一项和b数组的第一项相加，第二项分别相加.......
 */
public class 合并数组 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,7,8,9,10};
        int cd=a.length>b.length?a.length:b.length;  //选一个大的长度作为c的数组长度
        int[] c=new int[cd];

        for(int i=0;i<a.length;i++){  //先将a数组的值赋给 c数组
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++){  //再将b数组的值加在c数组上
            c[j]+=b[j];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }

    }
}
