<%@page import="fr.encheres.bo.Utilisateur"%>



<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Mon_Profil.css" />
<title>Page 5 le profil des autres</title>
</head>
<body>
	<%
		List<Utilisateur> utilisateurs = (List<Utilisateur>) request.getAttribute("utilisateurs");
	if (utilisateurs != null && utilisateurs.size() > 0) {
	%>

	<%
		for (Utilisateur utilisateur : utilisateurs) {
	%>



	<p>
		Pseudo :
		<%=utilisateur.getPseudo()%></p>
	<p>
		Prénom :
		<%=utilisateur.getPrenom()%></p>
	<p>
		Nom :
		<%=utilisateur.getNom()%></p>
	<p>
		E-mail :
		<%=utilisateur.getEmail()%></p>
	<p>
		Telephone :
		<%=utilisateur.getTelephone()%></p>
	<p>
		Rue :
		<%=utilisateur.getRue()%></p>
	<p>
		Code postal :
		<%=utilisateur.getCodePostal()%></p>
	<p>
		Ville :
		<%=utilisateur.getVille()%></p>
	<p>
		Credit :
		<%=utilisateur.getCredit()%></p>

	<%
		}
	%>

	<%
		} else {
	%>
	<p>Il n'y a aucun utilisateur à afficher</p>
	<%
		}
	%>



	<a href="SandrineFatosSEBcod/ServletAccueil"><button>Retour
			en arriere</button></a>

</body>
</html>