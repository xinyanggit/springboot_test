package com.yx;

import java.sql.DriverManager;

public class TestJdbc {
    private static String url = "jdbc:mysql://118.24.110.110:3306/yx_test_database?useSSL=false&serverTimezone=UTC";
//    private static String url = "jdbc\\:mysql\\://118.24.110.110\\:3306/yx_test_database?useSSL=false&serverTimezone=UTC";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String username = "yx_test2";
    private static String passworld = "yx_test2";
    
    public static void main(String[] args) throws Exception {
        Class.forName(driver).newInstance();
        //如果能连接成功，则打印连接
        System.out.println(DriverManager.getConnection(url, username, passworld));
        
    }
}