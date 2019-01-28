package com.lin.jdbc.Statement;

import java.sql.*;

public class Util {
    private Connection conn;  //链接对象
    private Statement statement;   //sql执行对象
    private ResultSet res;    //结果集对象
    private final String URL="jdbc:mysql://localhost:3306/login?useUnicode=true&characterEncoding=utf-8";
    private final String USER="root";
    private final String PASSWORD="123456";
    //加载驱动只需要加载一次,放在静态代码块中
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动不正确");
            e.printStackTrace();
        }
    }
    /**
     * 获得执行对象
     */
    public void getStatement(){
        //获得连接
        try {
            conn= DriverManager.getConnection(URL, USER, PASSWORD);
            statement=conn.createStatement();
        } catch (SQLException e) {
            System.out.println("数据库信息不正确");
            e.printStackTrace();
        }
    }
    /**
     * 信息增,删,改
     * @param sql
     */
    public void upData(String sql){
        getStatement();//先获得连接
        //执行sql
        try {
            int i=statement.executeUpdate(sql);
            if(i>0){
                System.out.println(i+"条信息操作成功");
            }else{
                System.out.println("该信息不存在...");
            }
        } catch (SQLException e) {
            System.out.println("sql语句错误...");
            e.printStackTrace();
        }
        //close();
    }
    /**
     * 信息查询
     * @param sql
     * @return
     */
    public ResultSet query(String sql){
        getStatement();
        try {
            res=statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql语句错误");
            e.printStackTrace();
        }
        //close();//这里不能关资源,因为后面还要用
        return res;
    }
    /**
     * 释放资源
     */
    public void close(){
        try {
            if(res!=null){
                res.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {if(statement!=null){
                statement.close();
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
