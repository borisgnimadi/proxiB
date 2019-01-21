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

		<% // Une fois loggé, le user n'a plus besoin d'accéder à cette page.
		// On le redirige vers la page d'accueil avec des users(gérant/conseiller).
			if (session.getAttribute("isLogged") != null) {
				Boolean sessionIsLogged = (Boolean) session.getAttribute("isLogged");
				if (sessionIsLogged == true) {
					out.println(session.getAttribute("isLogged"));
					response.sendRedirect("accueilAppli");
				}
			}
		%>

		<div class="alert alert-primary" role="alert">
			<p>
				Email de connexion : <b>test@proxi.bk</b> / Mot de passe : <b>test</b>
			</p>
			<%
				if (request.getAttribute("errorLogin") != null) {
			%>
			<div class="alert alert-danger" role="alert">
				<b><%=request.getAttribute("errorLogin")%></b>
			</div>
			<%
				}
			%>


		</div>
		<form class="form-signin" method="post" action="login">
			<img class="mb-4 img-circle" src="images/logo.jpg" alt="" width="72" height="72">
			<h1 class="h3 mb-3 font-weight-normal">ProxiBanqueSI</h1>
			<label for="inputEmail" class="sr-only">Votre adresse mail</label> <input
				name="email" type="email" id="inputEmail" class="form-control"
				placeholder="Adresse mail" required autofocus> <label
				for="inputPassword" class="sr-only">Mot de passe</label> <input
				name="password" type="password" id="inputPassword"
				class="form-control" placeholder="Mot de passe" required>
			<div class="checkbox mb-3"></div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
		</form>
	</div>
</body>
</html>