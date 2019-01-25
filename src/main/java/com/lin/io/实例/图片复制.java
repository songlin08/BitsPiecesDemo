package com.lin.io.实例;

import java.io.*;

public class 图片复制 {

    public static void main(String[] args) throws IOException {
        //图片来源
        FileInputStream in = new FileInputStream("C:/Users/15608/Pictures/10.png");
        File file = new File("C:/Users/15608/Desktop/new_picture.jpg");//后缀名不一样也可以复制
        FileOutputStream out = new FileOutputStream(file);
        int i;
        while ((i = in.read()) != -1 ){
            out.write(i);
        }
        System.out.println("图片复制完成！");
        out.close();
        in.close();

    }
}
