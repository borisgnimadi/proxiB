<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>ProxiBanque</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/login_style.css" rel="stylesheet">
</head>

<body class="text-center">
	<div class="container col-lg-12">


		<%
			String isloggedSessionIfo = (String) session.getAttribute("isLogged");
		%>
		test :
		<%=isloggedSessionIfo%>
		<form class="form-signin" method="post" action="connexion">
			<img class="mb-4" src="img/logo.jpg" alt="" width="72" height="72">
			<h1 class="h3 mb-3 font-weight-normal">ProxiBanqueSI</h1>
			<label for="inputEmail" class="sr-only">Votre adresse mail</label> <input
				name="email" type="email" id="inputEmail" class="form-control"
				placeholder="Adresse mail" required autofocus> <label
				for="inputPassword" class="sr-only">Mot de passe</label> <input
				name="password" type="password" id="inputPassword"
				class="form-control" placeholder="Mot de passe" required>
			<div class="checkbox mb-3"></div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2019</p>
		</form>
	</div>
</body>
</html>