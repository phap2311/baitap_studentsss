package com.example.manager_students.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/manager_students";
    private static String jdbcUsername = "root";
    private static String jdbcPassWord = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassWord);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


}
