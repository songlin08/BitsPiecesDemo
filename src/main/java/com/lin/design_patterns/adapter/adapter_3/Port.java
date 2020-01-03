package com.lin.design_patterns.adapter.adapter_3;

/**
 * 该接口包含所有的抽象方法
 */
public interface Port {

    /**
     * 远程SSH端口为22
     */
    void SSH();

    /**
     * 网络端口为80
     */
    void NET();

    /**
     * Tomcat容器端口为8080
     */
    void Tomcat();

    /**
     * MySQL数据库端口为3306
     */
    void MySQL();
}
