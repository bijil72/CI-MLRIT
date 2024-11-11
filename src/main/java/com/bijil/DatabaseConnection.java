package com.bijil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/b1"; // Replace with your DB URL
            String user = "root"; // Replace with your DB username
            String password = "root"; // Replace with your DB password
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!,BIJIL..>>>...");
        } catch (SQLException e) {
            System.out.println("Connection failed!, BIJIL...");
        }
        return conn;
    }
    public static void main(String[] args) {
        connect();
    }
}

