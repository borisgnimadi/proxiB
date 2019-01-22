<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="model.*"%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.ConseillerDao"%>
<%@page import="model.Personne"%>
<%@page import="service.ConseillerServiceCRUD"%>

<div class="container">
	<h2>Liste des clients</h2>

	<table class="table">
		<thead>
			<tr>
				<th>Référence Conseiller</th>
				<th>Nom</th>
				<th>Prénom</th>
			</tr>
<c:forEach items="${ listeClient }" var="client" varStatus="status">
      <tr>
        <td><c:out value="${ client.id }" /></td>
        <td><c:out value="${ client.nom }" /></td>
        <td><c:out value="${ client.prenom }" /></td>
        <td><a href="Conseiller?page=voir-client&clientid=<c:out value="${ client.id }" />">Voir/modifier client</a></td>
<%--          <td><a href="Conseiller?page=create_compte_courant&clientid=<c:out value="${ client.id }" />">Creer compte courant</a></td> --%>
<td><a class="btn-danger" href="?page=delete-client&id=<c:out value="${ client.id }" />">Supprimer</a></td>
      </tr>			
</c:forEach>			
			
		</thead>
		<tbody>
</table>