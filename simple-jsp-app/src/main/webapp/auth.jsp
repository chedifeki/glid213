<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" %>
<%--
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="right"><a href="inscription.jsp">Inscription</a></p>
<%if(request.getAttribute("erreur")!=null){ %>
<%= request.getAttribute("erreur")%>
<%} %>
	<form method="post" action="AuthController">
	<table >
		<tr><td>Login :</td><td><input type ="text" name="login"></td></tr>
		<tr><td>Mot de passe : </td><td><input type ="password" name="pwd"></td></tr>
		<tr><td><input type ="submit" value="Valider"></td><td><input type ="reset" value="annuler"></td></tr>
	</table>
</form>
</body>
</html>
--%>


<!DOCTYPE html>
<html>

<head>


	<meta charset="UTF-8">

	<title>CodePen - Log-in</title>

	<link rel='stylesheet' href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>

	<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />

</head>

<body>

<div class="login-card">
	<h1>Log-in</h1><br>
	<form method="post" action="AuthController">
		<input type="text" name="login" placeholder="Login">
		<input type="password" name="pwd" placeholder="Password">
		<input type="submit" name="login-submit" class="login login-submit" value="login">
	</form>
	<c:if test="${requestScope.erreur != null}">
		${requestScope.erreur}
	</c:if>
	<div class="login-help">
		<a href="inscription.jsp">Register</a>
	</div>
</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->

<script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>

</body>

</html>