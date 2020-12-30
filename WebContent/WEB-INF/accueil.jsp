<%@page import="fr.encheres.bo.Enchere"%>
<%@page import="java.util.List"%>

 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/accueil.css" />
    
<title>Les objets sont nos amis : Page d'accueil</title>

 

</head>
<body>
<div id="seconnecter">
    <p>ENI-Encheres</p>
    <a href="/SandrineFatosSEBcod/ServletConnexionMonCompte">s'inscrire - se
			connecter</a>

 

</div>

 

<h1 >Liste des enchères</h1>

 


<!-- Premiere section : choix de la catégorie d'enchère, filtre sur les mots et recherche-->

 

<section>
<div class="contenu">
<div>

 

        <!--Champ de recherche par filtres-->

 

        <label for="Filtres">Filtres</label>
        
        <input type="text" name="filtres" id="filtres" placeholder="🔎  Le nom de l'article contient...">

 

        <!--Liste deroulante des categories-->

 

        <br><br>
        <label for="Categorie">Catégorie</label>
        <select>
                <option>Toutes</option>
                <option>Informatique</option>
                <option>Ameublement</option>
                <option>Vêtement</option>
                <option>Sport et Loisirs</option>
        </select>
        </div>    <div>

 


<!--  String filtres=null;
//                 if (request.getParameter("filtres") !=null)
//                 {
//                     filtres=request.getParameter("filtres");
//                 }
<%-- %> --%>

 
-->
        
<form action="<%=request.getContextPath()%>/ServletAccueil" method = "post">
        <!--Bouton rechercher-->        
        
        <div class="rechercher">
        <a href="<%=request.getContextPath()%>/ServletAccueil">
        <button type="submit">Rechercher</button>
        </a>
        </div>
</form>
</div>
</div>
</section>

 

<!-- 2eme section affichage de la liste des encheres en cours filtrées-->

 

<section>

 

<div id="encheres">

 

<%--     <% List<Enchere> listeEnchere= (List<Enchere>)request.getAttribute("listeEnchere"); --%>
<!--      for(Enchere enchere:listeEnchere){
<%--         %> --%>
<%--         <%=enchere.getDate_enchere()%> --%>
<%--         <%=enchere.getMontant_enchere() %> --%>
<%--     <%     --%>
//     }
<%--     %> --%>
--> 
    <div id="enchere1"> 
    <fieldset>
        <div>    <img src="images/enchere1.jpg"alt="enchere1"/> </div>
        <div>    <p>Enchere1</p>         
                <p>Description enchere 1</p>
                <p>Prix : prix enchere 1</p>
                <p>Fin de l'enchère : date fin de l'enchere 1</p>
                <p>Vendeur : pseudo du vendeur 1</p>
         </div>
     </fieldset>
     </div>
    <div id="enchere2">
    <fieldset>
        <div>    <img src="images/enchere2.jpg"alt="enchere2"/> </div>
        <div>    <p>Enchere2</p>         
                <p>Description enchere 2</p>
                <p>Prix : prix enchere 2</p>
                <p>Fin de l'enchère : date fin de l'enchere 2</p>
                <p>Vendeur : pseudo du vendeur 2</p>
         </div>
         </fieldset>
    </div>

 

    <div id="enchere3">
    <fieldset>
        <div>    <img src="images/enchere3.jpg"alt="enchere3"/> </div>    
        <div>    <p>Enchere3</p>         
                <p>Description enchere 3</p>
                <p>Prix : prix enchere 3</p>
                <p>Fin de l'enchère : date fin de l'enchere 3</p>
                <p>Vendeur : pseudo du vendeur 3</p>
         </div>
         </fieldset>
    </div>
</div>

 

</section>
</body>
</html>