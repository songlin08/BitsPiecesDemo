package com.lin.design_patterns.adapter.adapter_3;

/**
 * 网站服务器
 * 需要Tomcat容器，Mysql数据库，网络服务，远程服务
 */
public class Server extends Wrapper {

    @Override
    public void SSH() {
        System.out.println("Server类: Connect success...");
    }

    @Override
    public void NET() {
        System.out.println("Server类: WWW...");
    }

    @Override
    public void Tomcat() {
        System.out.println("Server类: Tomcat is running...");
    }

    @Override
    public void MySQL() {
        System.out.println("Server类: MySQL is running...");
    }
}
