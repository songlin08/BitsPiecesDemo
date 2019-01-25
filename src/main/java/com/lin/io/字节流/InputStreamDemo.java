package com.lin.io.字节流;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *   字节输入流
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fin =
                new FileInputStream("D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt");
        //先读取第一个
        int i = fin.read(); //一个一个的读,没有数据可读就返回-1
        while(i != -1){
            //输出第一个
            System.out.println(i);
            //再读取下一个
            i = fin.read();
        }

        //定义数组
        byte[] bytes = new byte[500];
        //把数据读取到数组中,j:读取字节个数
        int j = fin.read(bytes);
        System.out.println("j : " + j);
        System.out.println("bytes : " + new String(bytes));
        //读完数据，一定要记得关闭资源
        fin.close();
    }
}
