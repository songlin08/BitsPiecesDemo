package com.lin.io.对象流;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectOutputStream只是覆盖  不会续写  解决办法
 * 先把文件中的内容读出来 ,装入集合中 然后再集合中装入当前对象
 * 最后把集合循环遍历存入
 */
public class ObjectOutputStreamDemo {
    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/Employee.txt";

    public static void main(String[] args) throws IOException {
          Employee employee1 = new Employee("张三","25","5800");
          Employee employee2 = new Employee("李四","28","7600");
          saveEmployee(employee1);
          saveEmployee(employee2);
    }

    /**
     * 保存对象
     * @param employee
     */
    public static void saveEmployee(Employee employee){
        //创建集合对象
        List<Employee> list=new ArrayList<Employee>();
        //先读取文件中已有的数据
        list = selectAllEmployee();
        list.add(employee);
        //创建对象输出流
        FileOutputStream out = null;
        ObjectOutputStream objOut = null;
        try {
            out = new FileOutputStream(path);
            objOut = new ObjectOutputStream(out);
            //循环写list中的员工
            for (Employee emp : list) {
                objOut.writeObject(emp);
            }
            System.out.println("写入对象完成");
            objOut.writeObject(null); //写入在每个文件的末尾写入一个null 对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(objOut,null);
            closeStream(out,null);
        }
    }

    /**
     * 查询所有员工
     * @return
     */
    public static List<Employee> selectAllEmployee(){
        //创建集合
        List<Employee> list = new ArrayList<Employee>();
        //对象流同样是基于字节流的基础上
        FileInputStream in = null;
        ObjectInputStream objIn = null;
        try {
            in = new FileInputStream(path);
            objIn = new ObjectInputStream(in);
            //把第一个对象读入 obj 中
            Object  obj;
            while ((obj = objIn.readObject()) != null){ //判断obj  是否为 null
                System.out.println("对象 ：" + obj);
                //把对象循环放入集合中
                list.add((Employee) obj);
                // java.io.EOFException    ObjectInputStream读取到文件末尾返回的是异常
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            //save(null);//异常说明该文件没有任何对象 存入一个null对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(null, in);
            closeStream(null, objIn);
        }
        System.out.println("对象查询完成：" + JSON.toJSONString(list));
        return list;
    }

    /**
     * 释放资源
     * @param out
     * @param in
     */
    public  static  void  closeStream(OutputStream out,InputStream  in){
        //关闭资源
        if(out!=null){
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(in!=null){
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
