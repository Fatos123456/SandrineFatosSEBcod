package fr.encheres.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.encheres.BusinessException;
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

		   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        List<Integer> listeCodesErreur=new ArrayList<>();
		        try {
		            //Recherche des repas
		            UtilisateurManager utilisateurManager = new UtilisateurManager();
		            List<Utilisateur> utilisateurs=null;
		            utilisateurs =  utilisateurManager.select();
		            
		        
		            request.setAttribute("utilisateurs", utilisateurs);
		        } catch (BusinessException e) {
		            e.printStackTrace();
		            request.setAttribute("listeCodesErreur",e.getListeCodesErreur());
		        }
		        
		        
		        //transfer des informations à la JSP
				// appeller la JSP
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ModifierMonProfil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

	
		String motDePasse = null;
		try {
			
			motDePasse = request.getParameter("motDePasse");

			UtilisateurManager utilisateurManager = new UtilisateurManager();

			Utilisateur utilisateur = utilisateurManager.modifier(motDePasse);
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
