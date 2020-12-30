<%@page import="fr.encheres.bo.Utilisateur"%>



<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Modifier_Profil2.css" />
<title>Les objets sont nos amis</title>
</head>
<body>
	<h1>Mon Profil</h1>
<%
		List<Utilisateur> utilisateurs = (List<Utilisateur>) request.getAttribute("utilisateurs");
	if (utilisateurs != null && utilisateurs.size() > 0) {
	%>

	<%
		for (Utilisateur utilisateur : utilisateurs) {
	%>
	<div class="infos_compte2">

			<div class="infos_12">
	<p>
		Pseudo :
		<%=utilisateur.getPseudo()%></p>
	<p>
		Prénom :
		<%=utilisateur.getPrenom()%></p>
	<p>
		Telephone :
		<%=utilisateur.getTelephone()%></p>
	<p>
		Code postal :
		<%=utilisateur.getCodePostal()%></p>
				</div>

			<div class="infos_2">
	<p>
		Nom :
		<%=utilisateur.getNom()%></p>
	<p>
		E-mail :
		<%=utilisateur.getEmail()%></p>
	<p>
		Rue :
		<%=utilisateur.getRue()%></p>
	<p>
		Ville :
		<%=utilisateur.getVille()%></p>
	
</div></div>
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
	<%
		Utilisateur utilisateur = (Utilisateur) request.getAttribute("utilisateur");
	%>


	<form action="<%=request.getContextPath()%>/ServletModifierMonProfil"
		method="post">

		<div class="infos_compte">

			<div class="infos_1">

<!-- 				<label for="pseudo"> Pseudo: </label> <input type="text" -->
<!-- 					name="pseudo" id="pseudo" required><br /> -->
					
<!-- 				<br> <label for="prenom"> Prénom :</label> <input type="text" -->
<!-- 					name="prenom" id="prenom" required><br /> -->
<!-- 				<br> <label for="telephone"> Téléphone :</label> <input -->
<!-- 					type="text" name="telephone" id="telephone"><br> -->
<!-- 				<br> <label for="codePostal"> Code postal :</label> <input -->
<!-- 					type="text" name="codePostal" id="codePostal" required><br /> -->
				<br> <label for="motDePasse"> Mot de Passe :</label> <input
					type="password" name="motDePasse" id="motDePasse" required>
				<br />
				<br>

			</div>

			<div class="infos_2">

<!-- 				<label for="nom"> Nom :</label> <input type="text" name="nom" -->
<!-- 					id="nom" required><br /> -->
<!-- 				<br> <label for="email">Email :</label> <input type="text" -->
<!-- 					name="email" id="email" required><br> -->
<!-- 				<br> <label for="rue">Rue :</label> <input type="text" -->
<!-- 					name="rue" id="rue" required><br> -->
<!-- 				<br> <label for="ville">Ville :</label> <input type="text" -->
<!-- 					name="ville" id="ville" required><br> -->
				<br> <label for="motDePasse"> Confirmer </label> <input
					type="password" name="motDePasse" id="motDePasse" required>
				<br />
				<br>

			</div>
		</div>





		<footer>

			<a href=""><button type="submit">Modifier</button></a> <a
				href="http://localhost:8080/ProjectEncheresFatos/ServletConnexion"><button>Annuler</button></a>

		</footer>
	</form>
</body>
</html>