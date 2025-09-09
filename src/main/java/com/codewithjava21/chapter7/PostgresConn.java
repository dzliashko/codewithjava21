package com.codewithjava21.chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConn {
    private static Connection conn;

    public PostgresConn(String url, String username, String password) {
        connectToPostgres(url, username, password);
    }

    private void connectToPostgres(String url, String username, String password) {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void closePostgresConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConn() {
        return this.conn;
    }
}
