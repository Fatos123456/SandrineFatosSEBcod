package fr.encheres.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletConnexionMonCompte
 */
@WebServlet("/ServletConnexionMonCompte")
public class ServletConnexionMonCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Cookie cookie = new Cookie("pseudo", "pseudo");
//		Cookie cookie2 = new Cookie("motDePasse", "motDePasse");
//		cookie.setMaxAge(30);
//		response.addCookie(cookie);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Connexion.jsp");
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UtilisateurManager utilisateurManager = new UtilisateurManager();
	    Utilisateur utilisateur = null; 

	            String pseudo = request.getParameter("pseudo");
	            String motDePasse = request.getParameter("motDePasse");


	            try {
	                utilisateur = utilisateurManager.connexion(pseudo, motDePasse);
	                HttpSession session = request.getSession();
	                utilisateur.getId();
	                session.setAttribute("pseudo", pseudo);
	                session.setAttribute("motDePasse", motDePasse);
	                session.setMaxInactiveInterval(3600);
	                
	                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/loginsuccess.jsp");
	                rd.forward(request,response);
	            
	            } catch (Exception e) {
	                response.sendRedirect("ServletConnexionMonCompte");
	            }
	            
//	            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ErreurConnexion.jsp");
//                rd.forward(request,response);
	        }
    

}
