<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% // Destruction de la session et redirection à l'accueil
session.invalidate();
response.sendRedirect("./");
%>