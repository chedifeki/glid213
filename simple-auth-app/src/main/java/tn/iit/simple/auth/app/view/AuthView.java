package tn.iit.simple.auth.app.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AuthView extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Inscription</title>\n" +
                "</head>\n" +
                "<body>\n" );
        if (req.getAttribute("erreur") != null){
            out.println("<p>" + req.getAttribute("erreur") +"</p>");
        }
        out.println(
                "<form method=\"post\" action=\"AuthController\">\n" +
                "    <table>\n" +
                "        <tr>\n" +
                "            <td>Login:</td>\n" +
                "            <td><input type=\"text\" name=\"login\" placeholder=\"Login\"/></td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>Mot de Passe:</td>\n" +
                "            <td><input type=\"password\" name=\"mot_de_passe\" placeholder=\"Mot de Passe\"/></td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td><input type=\"submit\" value=\"Valider\"/></td>\n" +
                "            <td><input type=\"reset\" value=\"Annuler\"/></td>\n" +
                "        </tr>\n" +
                "\n" +
                "    </table>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }


}
