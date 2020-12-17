package fr.encheres.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.Utilisateur;

/**
 * Author Fatos Servlet implementation class ServletModifierMonProfil
 */
@WebServlet("/ServletModifierMonProfil")
public class ServletModifierMonProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// appeller la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/modifierMonProfil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String pseudo = null;
		String nom = null;
		String prenom = null;
		String email = null;
		String telephone = null;
		String rue = null;
		String codePostal = null;
		String ville = null;
		String motDePasse = null;
		try {
			pseudo = request.getParameter("pseudo");
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue = request.getParameter("rue");
			codePostal = request.getParameter("codePostal");
			ville = request.getParameter("ville");
			motDePasse = request.getParameter("motDePasse");

			UtilisateurManager utilisateurManager = new UtilisateurManager();

			Utilisateur utilisateur = utilisateurManager.modifier(pseudo, nom, prenom, email, telephone, rue,
					codePostal, ville, motDePasse);
			request.setAttribute("utilisateur", utilisateur);
			// Si tout va bien transfer des informations à la JSP
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Connexion.jsp");
			rd.forward(request, response);
		}

		catch (Exception e) {
			e.printStackTrace();

//sinon on affiche le profil. 
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/afficherMonProfil.jsp");
			rd.forward(request, response);
		}
	}

}
