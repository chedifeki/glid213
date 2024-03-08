<%@ page language="java" %>
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
	<h1>Sign-Up</h1><br>
	<form method="post" action="verif.jsp">
		<input type ="text" name="nom" placeholder="Name">
		<input type ="text" name="prenom" placeholder="Surname">
		<input type ="text" name="login" placeholder="Login">
		<input type ="password" name="pwd" placeholder="Password">
		<input type="submit" name="signup-submit" class="login login-submit" value="Valider">
		<br>
		<input type ="reset" value="annuler"  class="login login-submit">
	</form>
</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->

<script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>

</body>

</html>