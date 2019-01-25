package com.lin.io.字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";
        //创建一个字节输出流
        FileOutputStream out = new FileOutputStream(path);
        //创建一个字节输出缓冲流
        BufferedOutputStream bout = new BufferedOutputStream(out);

        //写入一个字符串
        String str = "==缓冲输出流测试==";
        bout.write(str.getBytes());
        bout.flush(); //刷新缓冲区,也就是把缓冲区的东西写入
        System.out.println("写入完成！");

        //关流
        bout.close();
        out.close();
    }
}
