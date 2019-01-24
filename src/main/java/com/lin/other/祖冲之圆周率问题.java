package com.lin.other;

public class 祖冲之圆周率问题 {
    public static void main(String[] args) {

//         double pi=0;
//         int i=0;
//         for(;pi<3.1415926||pi>3.1415927;i++){
//        	 //计算项数的正负
//        	 if(i%2!=0){
//        		 pi-=4.0/(2*(i+1)-1);
//        	 }else{
//        		 pi+=4.0/(2*(i+1)-1);
//        	 }
//         }
//         System.out.println("经过了"+ i +"次算出了pi");
//======================================================
        double pi=0;
        for(int i=1;;i++){
            if(i%2==0){
                pi-=4.0/(2*i-1);//当为偶数时,符号为-
            }else{
                pi+=4.0/(2*i-1);  //当为奇数是时,符号为正
            }

            if(pi>3.1415926&&pi<3.1415927){
                System.out.println(i);
                break;  //满足条件终止循环
            }
        }


    }

}
