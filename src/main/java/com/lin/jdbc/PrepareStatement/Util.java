package com.lin.jdbc.PrepareStatement;

import java.sql.*;

public class Util {

    private static String URL = "jdbc:mysql://127.0.0.1:3306/test_db?useUnicode=true&characterEncoding=utf-8";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";


    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet;

    //静态代码块，一实例化就执行
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *   查询操作
     *    select * from student where name=? and sex=? and age=?
     *    Object[]  a ={"张三","男","52"};
     */
    public ResultSet queryData(String sql, Object[] objects){
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            pst = con.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pst.setObject(i+1,objects[i]);
            }
            resultSet = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /**
     *   新增，删除，修改操作
     */
    public int updateData(String sql, Object[] objects){
        int value = 0;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            pst = con.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pst.setObject(i+1,objects[i]);
            }
            value = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return value;
    }
}
