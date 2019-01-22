<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	String activeGerant = "";
	String activeConseiller = "";
	String userType = "";
	String path = (String) request.getAttribute("path");

	if (request.getAttribute("path") != null && path.contains("Gerant")) {
		activeGerant = "nav-item active";
		userType = "gerant";
	} else if (request.getAttribute("path") != null && path.contains("Conseiller")) {
		activeConseiller = "nav-item active";
		userType = "conseiller";
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="Appli Proxi Banque">
<meta name="author" content="Boris et Laurent">
<title>Proxi Banque SI</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse bg-primary navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a href="./"><img class="mb-4 img-circle" src="images/logo.jpg"
					alt="" width="60" height="60"></a>

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class=""><a href="./">Accueil</a></li>
					<li class="<%=activeGerant%>"><a class="nav-link"
						href="Gerant" id="navbardrop"> Gérant </a></li>
					<li class="<%=activeConseiller%>"><a class="nav-link"
						href="Conseiller" id="navbardrop"> Conseiller </a></li>
				</ul>


				<ul class="nav navbar-nav navbar-right">
					<li>Bonjour <%=session.getAttribute("nomUser")%></li>

					<li><a href="deconnexion.jsp">Déconnexion</a></li>
				</ul>

			</div>
		</div>
	</nav>