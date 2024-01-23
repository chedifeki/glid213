package tn.iit.app_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;



@WebServlet(value="/requestAffiche")

public class RequestDisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = "exemple 1";
        PrintWriter out = resp.getWriter();
        out.println("<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
                "<B>Request Method: </B>" +
                req.getMethod() + "<BR>\n" +
                "<B>Request URI: </B>" +
                req.getRequestURI() + "<BR>\n" +
                "<B>Request Protocol: </B>" +
                req.getProtocol() + "<BR><BR>\n" +
                "<B>Adresse IP Client: </B>" +

                req.getRemoteAddr() +

                "<BR>\n" +

                "<B>Nom Client: </B>" +
                req.getRemoteHost() +
                "<BR>\n" +
                "<TABLE BORDER=1 ALIGN=CENTER>\n" +

                "<TH>Header Name<TH>Header Value");
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName =
                    (String) headerNames.nextElement();
            out.println("<TR><TD>" + headerName);
            out.println(" <TD>" + req.getHeader(headerName));
        }
        out.println("</TABLE>\n</BODY></HTML>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
