package tn.iit.app_1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(value="/affichage")
public class AffichageServlet extends HttpServlet {

    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        Enumeration<String> paramNames = req.getParameterNames();
        while (paramNames.hasMoreElements()){
            String param = paramNames.nextElement();
            out.print(param+" : ");
            String[] paramValues = req.getParameterValues(param);
            for(String value : paramValues){
                out.println(value + " ");
            }
            out.print("<br>");

        }

    }
}
