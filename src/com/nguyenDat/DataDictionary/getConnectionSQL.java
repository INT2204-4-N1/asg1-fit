package com.nguyenDat.DataDictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class getConnectionSQL {

    public static  Connection getConnection(){
        // ten driver + url db
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/dictionary?autoReconnect=true&useSSL=false";

        //username + password
        final String user = "root";
        final String password = "12345";
        try{
            System.out.println("dang ket noi");
            Class.forName(JDBC_DRIVER);

            System.out.println("cai dat thanh cong");
            return DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println("cai dat that bai");
            e.printStackTrace();
        }
        return null;
    }
}
