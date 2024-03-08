package tn.iit.simple.jsp.app.auth.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
    private JdbcUtils() {
        // empty constructor to hide it
    }
    private static final Statement stmt;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jee", "root", null);
            stmt = cnx.createStatement();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Statement getStatement(){
        return stmt;
    }

}
