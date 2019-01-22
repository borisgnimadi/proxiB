<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="model.Personne"%>
<%@page import="model.Conseiller"%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.ConseillerDao"%>
<%@page import="model.Personne"%>
<%@page import="service.ConseillerServiceCRUD"%>

<div class="container">
	<h2>Liste des conseillers</h2>
	
	<table class="table">
		<thead>
			<tr>
				<th>Référence Conseiller</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Email</th>
			</tr>
<c:forEach items="${ listeConseiller }" var="conseiller" varStatus="status">
    
      <tr>
        <td><c:out value="${ conseiller.id }" /></td>
        <td><c:out value="${ conseiller.nom }" /></td>
        <td><c:out value="${ conseiller.prenom }" /></td>
        <td><c:out value="${ conseiller.email }" /></td>
<td><a href="?page=delete-conseiller&id=<c:out value="${ conseiller.id }" />">Supprimer</a></td>
      </tr>			
</c:forEach>			
			

		</thead>
		<tbody>

			<tr>
			</tr>

		</tbody>
	</table>

</div>