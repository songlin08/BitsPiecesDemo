package com.lin.other;

public class 质数问题 {
    public static void main(String[] args) {
//            //判断一个数是不是质数
//		        int a=1;
//				int b=13;//定义一个质数
//				int count=0;
//				do{
//		        	 if(b%a==0){
//		        		 count++;
//		        	 }
//		        	 a++;
//		         }while(a<=b);
//
//				if(count==2)
//		        	 System.out.println("是质数");
//		         else{
//		        	 System.out.println("不是质数");
//		         }

//--------------------------------------------------------
        //for循环做法
        int m=7;//m是质数
        boolean  f=true;  //这是一个标记,如果不进入if循环就不会发生改变,就是质数
        for(int i=2;i<m;i++){  //i是除数
            if(m%i==0){
                f=false;
                break;//结束本循环,能进来就代表不是质数
            }
        }
        if(f){
            System.out.println(m+"是质数");
        }
        else{
            System.out.println(m+"不是质数");
        }



    }
}
