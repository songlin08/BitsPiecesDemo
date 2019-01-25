package com.lin.jdbc;

import java.sql.*;

/**
 *   预编译，解决了sql注入的问题
 */
public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获得连接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url,username,password);
        // 3.获得预编译对象
        String sql = "select * from good where good_count = ?"; // ?是占位符
        PreparedStatement ps = conn.prepareStatement(sql);
        // 4.执行sql语句
        ps.setInt(1,100); //这是是传int型的参数，如果是String 就用setString....
        ResultSet res = ps.executeQuery(); //执行sql语句
        while (res.next()){
            System.out.print(res.getInt("good_id"));
            System.out.print("\t" + res.getString("good_name"));
            System.out.print("\t" + res.getInt("good_count"));
            System.out.println();
        }
        // 5.关闭资源
        res.close();
        ps.close();
        conn.close();


    }
}
