package com.lin.other;
//  2017年8月8日13:19:24
//  一个球从100米处掉落,反弹的高度是原来的一半,
//  请问第十次落地时,这个球经过了多少米,第十次的的反弹高度又是多少?
public class 小球反弹 {
    public static void main(String[] args) {
        double sum=100;
        double h=100;
        for(int i=1;i<10;i++){
            h/=2;
            sum+=2*h;

        }
        System.out.println("共经过:" + sum);
        System.out.println("第10次反弹高度为:" + h/2);

    }
}
