package com.lin.io.实例;

import sun.plugin.viewer.frame.WNetscapeEmbeddedFrame;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  把worker.txt 文件备份,该文件拷贝到指定位置并在文件名后加入日期信息进行备份。
 * (源文件名为test_io.txt 备份名为 worker2017-8-30.txt)
 */
public class 备份 {

    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    public static void main(String[] args) throws IOException {
        //定义原文件
        File oldFile = new File(path);
        String newName = getNewName(oldFile);
        //定义新文件
        File newFile = new File("C:/Users/15608/Desktop/" + newName);
        FileInputStream in = new FileInputStream(oldFile);
        FileOutputStream out = new FileOutputStream(newFile);
        //边读边写
        int i;
        while ((i = in.read()) != -1){
            out.write(i);
        }
        System.out.println("备份完成！");
        out.close();
        in.close();
    }

    /**
     * 获取新名字
     */
    public static String getNewName(File oldFile){
         String fileName = oldFile.getName();
         int end = fileName.lastIndexOf(".");
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         String newName = fileName.substring(0,end) + "(" + sdf.format(new Date())
                           + ")" + fileName.substring(end);
         return newName;
    }
}
