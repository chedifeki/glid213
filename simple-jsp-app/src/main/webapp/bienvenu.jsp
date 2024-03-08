<%@ page import="tn.iit.simple.jsp.app.auth.model.UtilisateurModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%UtilisateurModel user = (UtilisateurModel)session.getAttribute("courant");%>
Bienvenu : <%=user.getNom() %>
<%=user.getPrenom() %>
</body>
</html>