package com.lin.io.字节流;

import java.io.*;

/**
 *   字节输出流
 */
public class OutPutStreamDemo {

    public static void main(String[] args) throws IOException {
        overMethod();
    }

    public static void baseMethod() throws IOException{
        //创建一个字节输入流,从path读取数据到程序中
        String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";
        FileInputStream in = new FileInputStream(path);
        //创建一个输出流，把程序中的数据写到指定位置
        String path2 = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_out.txt";
        File file = new File(path2);
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file);
        int i = in.read(); //读第一个字节
        while (i != -1){ //判断读的是不是最后一个字节,是的话返回-1,终止循环
            out.write(i); //把这个字节写入file文件中
            i = in.read(); //再读下一个字节
        }
        System.out.println("复制成功！");
        //边存边取时,关流时,先开后关,后开先关
        out.close();
        in.close();
    }

    public static void overMethod() throws IOException {
        //创建一个文件输出流对象
        String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/覆盖文件.txt";
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        // true是续写,false是覆盖掉再写,默认false
        FileOutputStream out = new FileOutputStream(file,true);//也可以直接传path作为参数
        //写入几个字节
        out.write(97);
        out.write(98);
        out.write(99);
        //定义一个字符串
        String str= "哈哈,今天天气真好,好的春心荡漾,就像滔滔江水,绵绵不绝的洪荒之力喷涌而出";
        out.write(str.getBytes());
        System.out.println("输入完成");
        //关闭流
        out.close();

    }
}
