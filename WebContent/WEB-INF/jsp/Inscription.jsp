<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="fr.encheres.bo.Utilisateur"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Inscription.css" />

 

<title>Les objets sont nos amis</title>
</head>
<body>
    <h1>Mon Profil</h1>
    
    
    <% Utilisateur utilisateur = (Utilisateur) request.getAttribute("utilisateur"); %>
    
    
    <form action="<%=request.getContextPath()%>/ServletAjoutUtilisateur" method="post">

 

        <div id="infos_compte">

 

                <div id="infos_1">

 

                    <label for="pseudo"> Pseudo: </label> 
                    <input type="text" name="pseudo" id="pseudo" required><br/><br>

 

                    <label for="prenom"> Prénom :</label> 
                    <input type="text" name="prenom" id="prenom" required><br/><br>

 

                    <label for="telephone"> Téléphone :</label>
                    <input type="text" name="telephone" id="telephone"><br><br>

 

                    <label for="codePostal"> Code postal :</label> 
                    <input type="text" name="codePostal" id="codePostal" required><br/><br>

 

                    <label for="motDePasse"> Mot de Passe :</label>
                    <input type="password" name="motDePasse" id="motDePasse" required> <br/><br>

 

                </div>

 

                <div id="infos_2">

 

                    <label for="nom"> Nom :</label> 
                    <input type="text" name="nom" id="nom" required><br/><br>

 

                    <label for="email">Email :</label>
                    <input type="text" name="email" id="email" required><br><br>

 

                    <label for="rue">Rue :</label>
                    <input type="text" name="rue" id="rue" required><br><br>

 

                    <label for="ville">Ville :</label>
                    <input type="text" name="ville" id="ville" required><br><br>

 

                    <label for="motDePasse"> Confirmer </label>
                    <input type="password" name="motDePasse" id="motDePasse" required> <br/><br>

 

                </div>    
        </div>
        
 
            <a href="">        
            <button id="creer" type="button" class="btn btn-success">Créer</button>    
            </a>
              
            <a href="page1Accueil.html">
            <button id="annuler" type="button" class="btn btn-primary">Annuler</button> 
            </a>
      
     </form>
      
          <%
          if(utilisateur != null)
        {
        %>
                <p style="color:green;">Le compte a été créé avec succès !</p>
                <p><%=utilisateur %></p>
        <%    
        } else
        {
        %>    
            <p style="color:red;">Le compte n'a pas été créé !</p>
        <%    
        }
          %>
      
</body>
</html>