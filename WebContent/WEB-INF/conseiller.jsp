<div class="serviceHeader">

<a class="btn btn-md btn-primary" href="accueilAppli?page=conseiller&page2=voir-liste-clients" role="button">Voir la liste de mes clients</a>
<a class="btn btn-md btn-success" href="accueilAppli?page=conseiller&page2=ajout-client" role="button">Ajouter un nouveau client</a>
<a class="btn btn-md btn-info"    href="accueilAppli?page=conseiller&page2=virement" role="button">Effectuer un virement</a>
</div>
<div class="wellContainer">
	<%
		String pageConseiller = request.getParameter("page2");
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
