package com.lin.distinct;

/**
 * 找出每个元素出现的次数，
 * 如：数组int[] arrold={1,2,3,4,5,2,3,4,2,6}
 * 打印出  1出现了1次 2出现了3次 3出现了
 */
public class Demo3 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,2,3,4,2,6};
        for(int i=0;i<a.length-1;i++){  //给数组排序,升序

            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++){  //拿出一个数来和其他数作比较
            int count=0;  //记录重复次数
            if(i>1){
                if(a[i]==a[i-1]){ //排序后的相同的肯定在一起,如果相同的话就终止本次循环
                    continue;
                }
            }
            for(int j=0;j<a.length;j++){//循环出所有的元素,包括第一次循环拿出来比较的a[i]
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println(a[i] + "出现了" + count + "次");
        }
    }
}
