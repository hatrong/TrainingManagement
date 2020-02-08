package com.hbt.st.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_stafftraining", "root", "070599");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String args[]) {
        System.out.println(getConnection());
    }

}
