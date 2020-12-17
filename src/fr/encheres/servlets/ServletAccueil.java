package fr.encheres.servlets;

 

import java.io.IOException;
import java.util.List;

 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import fr.encheres.bll.EnchereManager;
import fr.encheres.bo.Enchere;
import fr.encheres.exceptions.BusinessException;

 

/**
 * Servlet implementation class ServletAccueil
 */
@WebServlet("/ServletAccueil")
public class ServletAccueil extends HttpServlet {
    private static final long serialVersionUID = 1L;

 

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/accueil.jsp");
        rd.forward(request, response);
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String filtres = null;
            try {
                // Recherche des enchères
                EnchereManager enchereM = new EnchereManager();
                List<Enchere> listeEnchere = null;
                if (filtres == null) {
                    listeEnchere = enchereM.selectionnerEncheres();
                }
                // else
                // {
                // listeEnchere = enchereM.selectionnerAvecFiltres(filtres);
                // }
                request.setAttribute("listeEnchere", listeEnchere);
            } catch (BusinessException e) {
                e.printStackTrace();
                request.setAttribute("error", e.getMessage());
            }
            // Transfert de l'affichage à la JSP
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/accueil.jsp");
            rd.forward(request, response);
        }
    }        