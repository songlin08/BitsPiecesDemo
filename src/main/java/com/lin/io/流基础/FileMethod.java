package com.lin.io.流基础;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileMethod {

    //创建一个文件对象,路径是path,前提是要在这个目录下有这个文件
    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";
    static String path2 = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io2.txt";
    static String path3 = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io3.txt";
    static File file1 = new File(path);
    static File file2 = new File(path2);
    static File file3 = new File(path3);

    public static void main(String[] args) {

//        baseMethod();

//        createMethod();

        printMethod();

    }

    /**
     *  基础方法
     */
    public static void baseMethod(){
        System.out.println("该文件能不能被操作（就是查看有没有）：" + file1.canExecute());
        System.out.println("该文件能不能被读 ：" + file1.canRead());
        System.out.println("该文件能不能被写 ：" + file1.canWrite());
        System.out.println("两个文件相比：" + file1.compareTo(file2));
        System.out.println("file2的文件大小：" + file2.length());
        System.out.println("file2的文件名：" + file2.getName());
        System.out.println("file2是否存在：" + file2.exists());
        System.out.println("file2是否是文件：" + file2.isFile());
        System.out.println("file2是否是隐藏文件：" + file2.isHidden());
        System.out.println("file2文件最后一次被修改的时间：" + new Date(file2.lastModified()));
        System.out.println("把file1的名字换成file2的：" + file1.renameTo(file2));
    }

    /**
     *  文件路径
     */
    public static void pathMethod(){
        System.out.println("file2文件绝对路径：" + file2.getParent());
        System.out.println("file2是否是绝对路径：" + file2.isAbsolute());
        System.out.println("file2路径名字符串：" + file2.toString());
        System.out.println("file2路径URL：" + file2.toURI());
    }

    /**
     * 创建文件
     */
    public static void createMethod(){
        try {
            file3.createNewFile(); //创建一个新文件file3
            System.out.println("file3新文件创建完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f5 = new File("D:/c/f/w/k");
        System.out.println("创建多层目录:"+f5.mkdirs());

        File f6 = new File("D:/d");
        System.out.println("创建单层目录:"+f6.mkdir());
    }

    /**
     * 删除文件
     */
    public static void deleteMethod(){
        file3.deleteOnExit();  //代码执行完才删除
        boolean bool = file3.delete(); //删除空文件夹或者文件
        System.out.println("删除file3文件：" + bool);
    }

    /**
     * 遍历文件
     */
    public static void printMethod(){
        System.out.println("=========打印D盘下所有文件,以字符串形式存放============");
        File file = new File("D:/");
        String[] str = file.list();
        for (String s : str) {
            System.out.println("遍历str：" + s);
        }

        System.out.println("=========打印D盘下所有文件,以文件形式存放============");
        File file2 = new File("D:/");
        File[] files = file2.listFiles();
        for (File file3 : files) {
            System.out.println("遍历files：" + file3);
        }

    }
}
