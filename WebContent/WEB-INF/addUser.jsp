<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
body{
margin:50px 50px 50px 50px;
.
}
</style>

<body>

<div class="contenair">
	<p>Bonjour ${user.name}</p>



	<h1>Créer un nouveau membre :</h1>

	<form action="ajout-un-membre" method="post">
		<div class="form-group">
			<label for="email">Nom</label> <input type="text"
				class="form-control" name="name" id="name">
		</div>
		<div class="form-group">
			<label for="pwd">Prénom:</label> <input type="text"
				class="form-control" name="firstname" id="firstname">
		</div>

		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	</div>
</body>
</html>