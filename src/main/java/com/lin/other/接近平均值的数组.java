package com.lin.other;

public class 接近平均值的数组 {
    public static void main(String[] args) {
        int[] a={8,1,5,4,2};
        double[] b=new double[a.length];   //定义一个b数组和a长度一样
        double sum=0;
        double avg=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];	  //对a数组求和
        }
        avg=sum/a.length;   //求a数组的平均值
        for(int i=0;i<a.length;i++){
            b[i]=(avg-a[i])*(avg-a[i]);   //给b数组赋值,每个元素是平均值减去a数组元素的平方,平方是为了消除负号,方便比较
            System.out.print(b[i] + " ");   //遍历出b数组
        }
        System.out.println();
        double min=b[0];
        int index=0;
        for(int i=0;i<b.length;i++){
            if(min>b[i]){    //找出b数组的最小值,对应的就是a数组最接近平均值的元素
                min=b[i];
                index=i;   //拿出最小值的下标
            }
        }
        System.out.println("平均值为:" + avg);
        System.out.println("最接近平均值的元素下标为:" + index);



    }
}
