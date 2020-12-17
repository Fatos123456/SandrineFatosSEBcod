<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="fr.encheres.bo.Utilisateur"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Connexion.css" />
<title>Les objets sont nos amis - Connexion</title>
</head>
<body>


       
      <form action="<%=request.getContextPath()%>/ServletConnexionMonCompte" method="post">
        

		<label for="pseudo"> Identifiant :</label> 
        <input type="text" name="pseudo" id="pseudo" placeholder="Votre pseudo"/><br/><br>

        <label for="motDePasse"> Mot de Passe :</label>
        <input type="password" name="motDePasse" id="motDePasse" placeholder="Votre mot de passe"/> <br/><br>


	
        <div id="connexion">     
        <div>
            <a href="<%=request.getContextPath()%>/AccueilMonCompte1">
            <button type="submit"> Connexion </button> 
            </a>
               
           </div>
            <div id="souvenirdemoi">
                <input type="checkbox" name="souvenirdemoi" value="souvenirdemoi" id="souvenirdemoi"/> 
                            <label for="souvenirdemoi" class="choicelabel"> Se souvenir de moi </label><br/><br>

                <a href=""> Mot de passe oublié </a> <br/><br> 
            </div>     

        </div>
        
     </form>

        <div id="compte">
            <a href="<%=request.getContextPath()%>/ServletAjoutUtilisateur">
        <input type="submit" value="Créer un compte">
            </a>
        </div>
        
	
</body>
</html>