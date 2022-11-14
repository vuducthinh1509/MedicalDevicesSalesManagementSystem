package utility;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbUtil {
    private static DbUtil instance;
    private Connection connection;

    private DbUtil() {
        try {
            String url = "jdbc:mysql://localhost:3306/demo";
            String userName = "root";
            String password = "";
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DbUtil getInstance() throws SQLException {
        if(instance == null ||instance.getConnection().isClosed()) {
            instance = new DbUtil();
        }
        return instance;
    }

    public static void releaseResource(ResultSet rs, Statement stmt, PreparedStatement pstmt, CallableStatement cstmt, Connection conn) throws SQLException {
        if(rs != null) {
            rs.close();
        }
        if(stmt != null) {
            stmt.close();
        }
        if(pstmt != null) {
            pstmt.close();
        }
        if(cstmt != null) {
            cstmt.close();
        }
        if(conn != null) {
            conn.close();
        }
    }
}