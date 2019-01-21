<div class="serviceHeader">

<a class="btn btn-md btn-primary" href="Conseiller?page=liste-client" role="button">Voir la liste de mes clients</a>
<a class="btn btn-md btn-success" href="Conseiller?page=ajout-client" role="button">Ajouter un nouveau client</a>
<a class="btn btn-md btn-info"    href="Conseiller?page=virement" role="button">Effectuer un virement</a>
</div>
<div class="wellContainer">
	<%
		String pageConseiller = request.getParameter("page");
		if (pageConseiller != null) {
			switch (pageConseiller) {
			case "voir-liste-clients":
	%><%@include file="liste_client.jsp"%>
	<%
		break;
			case "ajout-client":
	%><%@include file="ajout_client.jsp"%>
	<%
		break;
			case "virement":
	%><%@include file="virement.jsp"%>
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
