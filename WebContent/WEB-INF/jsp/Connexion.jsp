<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/Connexion.css" />
<title>Les objets sont nos amis</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/ServletConnexionMonCompte">

		<label for="username"> Identifiant :</label> 
        <input type="text" name="username" id="username"/><br/><br>

        <label for="password"> Mot de Passe :</label>
        <input type="password" name="password" id="password"/> <br/><br>


	
        <div id="connexion">     
            <button type="submit"> Connexion </button> 
            </a>
            
        </form>
           
            <div id="mdp">
                <input type="checkbox" name="souvenir" value="souvenir" id="souvenir"/> 
                            <label for="souvenir" class="choicelabel"> Se souvenir de moi </label><br/><br>

                <a href=""> Mot de passe oublié </a> <br/><br> 
            </div>     

        </div>

        <div id="compte">
            <a href="Inscription.html">
        <input type="submit" value="Créer un compte">
            </a>
        </div>
</body>
</html>