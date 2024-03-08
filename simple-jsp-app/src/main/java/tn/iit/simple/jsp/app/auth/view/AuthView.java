package tn.iit.simple.jsp.app.auth.view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthView
 */
@WebServlet("/AuthView")
public class AuthView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthView() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n");
		if(request.getAttribute("erreur")!=null) {
			out.println(request.getAttribute("erreur"));
		}
		out.println( "	<form method='post' action='AuthController'>\r\n"
				+ "	<table>\r\n"
				+ "		<tr><td>Login :</td><td><input type =\"text\" name=\"login\"></td></tr>\r\n"
				+ "		<tr><td>Mot de passe : </td><td><input type =\"password\" name=\"pwd\"></td></tr>\r\n"
				+ "		<tr><td><input type =\"submit\" value=\"Valider\"></td><td><input type =\"reset\" value=\"annuler\"></td></tr>\r\n"
				+ "	</table>\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
