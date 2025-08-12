package com.example.app;

import java.sql.*;

public class UnsafeExample {
    // Intentionally bad for demonstration:
    private static final String HARDCODED_PASSWORD = "supersecret"; // flagged

    // SQL injection risk (concatenation) - DO NOT USE IN REAL CODE
    public int countUsersByName(Connection conn, String userInputName) throws SQLException {
        String sql = "SELECT COUNT(*) FROM users WHERE name = '" + userInputName + "'";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            rs.next();
            return rs.getInt(1);
        }
    }
}
