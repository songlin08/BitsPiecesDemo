package com.lin.jdbc.Statement;

import java.sql.*;

/**
 *    第一种用Statement对象，这样不安全，容易sql注入
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        // 1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获得连接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url,username,password);
        // 3.获得执行对象
        Statement statement = conn.createStatement();
        // 4.返回结果集
        String sql = "select * from good"; //如果要传参的话，只能用字符串拼接拼在sql字符串中。
        ResultSet res = statement.executeQuery(sql);
        while (res.next()){ //判断有没有下一条数据,没有返回false
            System.out.print(res.getInt(1));
            System.out.print("\t" + res.getString(2));
            System.out.print("\t" + res.getInt(3));
            System.out.println();
        }
        // 5.关闭资源
        res.close();
        statement.close();
        conn.close();
    }
}
