<div class="serviceHeader">
	<a class="btn btn-md btn-primary" href="Gerant?page=liste-client" role="button">Voir la liste des clients</a> 
	<a class="btn btn-md btn-info" href="Gerant?page=liste-conseiller" role="button">Liste des conseillers</a> 
		<a class="btn btn-md btn-success" href="Gerant?page=ajout-conseiller" role="button">Ajouter un conseiller</a>
	<a class="btn btn-md btn-warning" href="Gerant?page=audit" role="button">Effectuer un audit</a>
</div>
<div class="wellContainer">
	<%
		String pageGerant = request.getParameter("page");
		if (pageGerant != null) {
			switch (pageGerant) {
			case "liste-client":
	%><%@include file="liste_client.jsp"%>
	<%
		break;
			case "liste-conseiller": case "delete-conseiller":
	%><%@include file="liste_conseiller.jsp"%>
	<%
		break;
			case "ajout-conseiller":
	%><%@include file="ajout_conseiller.jsp"%>
	<%
		break;
			case "audit":
	%><%@include file="audit.jsp"%>
	<%
		break;
			default:
	%><%@include file="liste_client.jsp"%>
	<%
		break;
			}
		}
	%>
	

</div>
