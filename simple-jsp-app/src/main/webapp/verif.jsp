<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01/03/2024
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="tn.iit.simple.jsp.app.auth.model.Utilisateur" scope="session"/>
<jsp:setProperty property="*" name="user"></jsp:setProperty>
vous avez saisi :
<br> Nom: ${param.nom}
<br> prenom: ${param.prenom}
<br> login: ${param.login}
<br> password: ${param.pwd}

<br>
<input type="button" onclick="window.location.href='InscriptionController'  " value="valider">
<input type="button" onclick="window.location.href='inscription.jsp'  " value="Corriger">
</body>
</html>
