<%@ include file="header.jsp"%>

<div class="contenaire">
<%-- 	<p>Bonjour ${user.name}</p> --%>

	<%
		// si user non logg�, on le redirige vers la page de login.
		if (session.getAttribute("isLogged") == null || (Boolean) session.getAttribute("isLogged") == false) {
			response.sendRedirect("login");
		}


	%>

	<div class="col-lg-12 col-md-12" id=""
		style="padding-top: 10px">


		<div class="tab-content">
<% 
            switch(userType){
                case "gerant":%><%@include file="gerant.jsp"%><%
                break; 
                case "conseiller":%><%@include file="conseiller.jsp"%><%
                break; 
                default :%><%@include file="indexAccueil.jsp"%><%
                break; 
            } 

        %>		

	</div>
	</div>

	<!-- form action="addUser" method="post">
		<div class="form-group">
			<label for="email">Nom</label> <input type="text"
				class="form-control" name="name" id="name">
		</div>
		<div class="form-group">
			<label for="pwd">Pr�nom:</label> <input type="text"
				class="form-control" name="firstname" id="firstname">
		</div>

		<button type="submit" class="btn btn-default">Submit</button>
	</form-->
</div>
<%@ include file="footer.jsp"%>
