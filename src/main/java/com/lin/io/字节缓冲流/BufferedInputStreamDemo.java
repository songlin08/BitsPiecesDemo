package com.lin.io.字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *  字节流直接读取会降低磁盘的IO性能所以有了缓冲流来提高效率
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";
        //创建一个字节流，缓冲流是建立在字节流的基础上的
        FileInputStream in = new FileInputStream(path);
        //创建一个字节缓冲流
        BufferedInputStream bin = new BufferedInputStream(in);
        byte[] arr = new byte[1024];
        int i =  bin.read(arr);
        while ( i != -1 ){
            System.out.println(new String(arr,0,i)); //如果输出乱码，可能是文件格式不是utf-8，可以用notepad++设置
            i = bin.read(arr);
        }
        System.out.println("读取完成！");
        //关闭资源
        bin.close();
        in.close();

    }
}
