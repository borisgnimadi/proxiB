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

			<%
				//List<Client> listecl = (List<Client>) request.getAttribute("listeClient");
			%>	
			<%="test liste client : "+request.getAttribute("listeClient")%>