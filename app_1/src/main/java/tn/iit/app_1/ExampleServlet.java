package tn.iit.app_1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        value = "/example",
        initParams = {
                @WebInitParam(name = "email", value = "webmaster@domain.com", description = "Email from webmaster"),
                @WebInitParam(name = "phone", value = "xxxx/xx.xx.xx", description = "Phone webmaster")
        },
        description = "Servlet 3 initialisation parameter annotation example @WebInitParam"
)
public class ExampleServlet extends HttpServlet {
    private String email, phone;

    @Override
    public void init(ServletConfig config) throws ServletException {
        email = config.getInitParameter("email");
        phone = config.getInitParameter("phone");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<p>email = " + email + "</p>");
        out.println("<p>phone = " + phone + "</p>");
        out.close();
    }


}
