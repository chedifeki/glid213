package tn.iit.simple.auth.app.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tn.iit.simple.auth.app.model.Utilisateur;

import java.io.IOException;
import java.util.List;

import static tn.iit.simple.auth.app.Constants.CONTEXT_USER_LIST;
import static tn.iit.simple.auth.app.Constants.ERROR;

@WebServlet(value="/AuthController")

public class AuthController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pwd = req.getParameter("pwd");
        var found = false;
        ServletContext context = getServletContext();
        List<Utilisateur> users = (List<Utilisateur>) context.getAttribute(CONTEXT_USER_LIST);

        if (users == null){
            req.setAttribute(ERROR, "Aucun utilisateur n'est inscrit!!!");
            var rd = context.getRequestDispatcher("/authentification");
            rd.forward(req, resp);
        }
        else {
            for(var user :users){
                if (user.getLogin().equals(login) && user.getPwd().equals(pwd)){
                    found = true;
                    HttpSession session = req.getSession();
                    session.setAttribute("userCourant", user);
                    break;
                }
            }

            if (!found){
                req.setAttribute(ERROR, "veuillez verifier vos paramètres!");
                var rd = context.getRequestDispatcher("/authentification");
                rd.forward(req, resp);
            }
            else {
                var rd = context.getRequestDispatcher("/index");
                rd.forward(req, resp);
            }
        }

    }
}
