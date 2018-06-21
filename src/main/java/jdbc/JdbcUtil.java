package jdbc;

import java.sql.*;

public class JdbcUtil {

    public static Connection getConnection() throws SQLException {
        Driver psqlDriver = new org.postgresql.Driver();
        DriverManager.registerDriver(psqlDriver);

        final String url = "jdbc:postgresql://localhost:5432/jdbc_example";
        final String user = "test_user";
        final String password = "test_pass";

        Connection conn = DriverManager.getConnection(url, user, password);
        conn.setAutoCommit(false);

        return conn;
    }

    public static void commit(Connection conn) {
        try {
            if (conn != null){
                conn.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(Connection conn) {
        try {
            if (conn != null){
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeStatement(Statement stm) {
        try {
            if (stm != null){
                stm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
