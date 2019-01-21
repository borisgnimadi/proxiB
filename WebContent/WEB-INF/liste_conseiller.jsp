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
			<%
				List<Conseiller> listeconseillers = (List<Conseiller>) request.getAttribute("listeConseiller");
			%>
	<table class="table">
		<thead>
			<tr>
				<th>Référence Conseiller</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>

		<%

			int i = 0;
			while (i < listeconseillers.size()) {
		%>
		<tr>
			<td><%=listeconseillers.get(i).getId()%></td>
			<td><%=listeconseillers.get(i).getNom()%></td>
			<td><%=listeconseillers.get(i).getPrenom()%></td>
			<td><%=listeconseillers.get(i).getEmail()%></td>
			<td><a href="?page=delete-conseiller&id=<%=listeconseillers.get(i).getId()%>">Supprimer</a></td>
		</tr>

		<%
			i++;
			}
		%>

			<tr>
			</tr>

		</tbody>
	</table>

</div>