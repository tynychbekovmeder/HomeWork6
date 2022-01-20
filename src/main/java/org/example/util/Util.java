package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String userName = "postgres";
    private static final String password = "5996";

    public static Connection connect() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,userName, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
