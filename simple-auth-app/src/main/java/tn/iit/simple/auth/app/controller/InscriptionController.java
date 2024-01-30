package tn.iit.simple.auth.app.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.iit.simple.auth.app.model.Utilisateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static tn.iit.simple.auth.app.Constants.CONTEXT_USER_LIST;


@WebServlet(value="/InscriptionController")
public class InscriptionController extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hi i'm in do post of inscription controller");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String login = req.getParameter("login");
        String pwd = req.getParameter("pwd");
        Utilisateur user = new Utilisateur(nom, prenom, login,pwd);
        System.out.println(user);
        ServletContext context = getServletContext();
        List<Utilisateur> users = (List<Utilisateur>) context.getAttribute(CONTEXT_USER_LIST);
        if (users == null){
            users = new ArrayList<>();
        }
        users.add(user);
        context.setAttribute(CONTEXT_USER_LIST,users);

        resp.sendRedirect("authentification");
    }
}
