package tn.iit.simple.jsp.app.auth.model;

import jdk.jshell.execution.Util;
import tn.iit.simple.jsp.app.auth.utils.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurDAO {
    private final static String DB_TABLE = "utilisateurs";

    public void persist(Utilisateur user) {
        String query = "insert into "+ DB_TABLE +" values (0,'" + user.getNom()
                + "','" + user.getPrenom() + "','" + user.getLogin() + "','" + user.getPwd() + "');";

        Statement stmt = JdbcUtils.getStatement();
        try {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Utilisateur findByLogin(String login, String pwd) {
        String query = "select * from "+ DB_TABLE+" where login='" + login + "' and pwd='"+pwd+"'";

        Statement stmt = JdbcUtils.getStatement();
        try {
            ResultSet rsl =  stmt.executeQuery(query);
            if (rsl.next()){
                Utilisateur u = new Utilisateur(rsl.getString(2),
                        rsl.getString(3),
                        rsl.getString(4),
                        rsl.getString(5));
                return u;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
