<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DateHeure JSP</title>
</head>
<body>
<!-- On accède aux models via l'expression language ${} -->
	<h1>Application Spring MVC</h1>
	<h2>Heure générée par le serveur</h2>
	<p>${heureFormate }</p>
	
	<h2>Liste de chaines: </h2>
	<p>${liste }</p>
</body>
</html>