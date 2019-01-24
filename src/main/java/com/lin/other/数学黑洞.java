package com.lin.other;
/*
 * 所有四位数字（全相同的除外），均能得到 6174 ,输出掉进黑洞的 步数。
 */
public class 数学黑洞 {
    public static void main(String[] args) {

        for(int s=1000;s<10000;s++){  //循环出所有的四位数
            int  count=0;
            if(s==1111 ||s==2222 ||s==3333 ||s==4444 ||s==5555 ||s==6666 ||s==7777 ||s==8888 ||s==9999 ){
                continue;
            }
            int i=s;
            do{
                int a=i/1000;  //获取千位数
                int b=i%1000/100; //获取百位数
                int c=i%100/10;  //获取十位数
                int d=i%10;    //获取个位数
                int[] arr={a,b,c,d};
                //找到四位数组成的最大值
                for(int j=0;j<arr.length;j++){//外层循环控制轮
                    for(int k=j+1;k<arr.length;k++){  //找出j后面所有的进行比较,得到降序排列
                        if(arr[j]<arr[k]){
                            int temp=arr[j];
                            arr[j]=arr[k];
                            arr[k]=temp;
                        }
                    }
                }int max=arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
                //找到四位数组成的最小值
                int min=arr[3]*1000+arr[2]*100+arr[1]*10+arr[0];
                i=max-min;  //最大值减最小值,得到一个新的四位数
                count++;  //累加次数
            }while(i!=6174);  //判断条件,当i不等于6174时继续循环

            System.out.println(s + ",该数掉进黑洞步数为:" + count);

        }

    }
}
