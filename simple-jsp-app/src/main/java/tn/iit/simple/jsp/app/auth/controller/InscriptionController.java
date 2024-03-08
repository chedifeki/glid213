package tn.iit.simple.jsp.app.auth.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.iit.simple.jsp.app.auth.model.Utilisateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/InscriptionController")
public class InscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		Utilisateur user = new Utilisateur(nom, prenom, login, pwd);
		ServletContext application = getServletContext();
		List<Utilisateur> l = (List<Utilisateur>) application.getAttribute("listUsers");
		if(l == null) {
			l = new ArrayList<>();
		}
		l.add(user);
		application.setAttribute("listUsers", l);
		RequestDispatcher rd = application.getRequestDispatcher("/auth.jsp");
		rd.forward(request, response);

		
	}

}
