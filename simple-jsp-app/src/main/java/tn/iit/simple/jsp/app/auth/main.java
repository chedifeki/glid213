package tn.iit.simple.jsp.app.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection ctx = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jee", "root",null );
            Statement stmt = ctx.createStatement();
             ResultSet rslt = stmt.executeQuery("select * from utilisateurs");
             while (rslt.next()){
                 System.out.println(rslt.getString(2));
             }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
