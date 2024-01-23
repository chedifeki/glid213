package tn.iit.simple.auth.app.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.iit.simple.auth.app.model.UserModel;

import java.io.IOException;
import java.util.List;

public class AuthController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pwd = req.getParameter("password");

        ServletContext context = getServletContext();
        List<UserModel> userModels = (List<UserModel>) context.getAttribute("listUsers");

        if (userModels == null){
            req.setAttribute("erreur", "Aucun utilisateur n'est inscrit!!!");
            var rd = context.getRequestDispatcher("/AuthView");
            rd.forward(req, resp);
        }


    }
}
