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
import javax.servlet.http.HttpSession;

 

import fr.encheres.BusinessException;
import fr.encheres.bll.UtilisateurManager;
import fr.encheres.bo.Utilisateur;

 

 

/**
 * author Fatos
 * Servlet implementation class ServletAfficherProfil
 */
@WebServlet("/ServletAfficherProfil")
public class ServletAfficherProfil extends HttpServlet {
    private static final long serialVersionUID = 1L;
//    private Utilisateur utilisateur = new Utilisateur();
//    private static UtilisateurManager utilisateurManager = UtilisateurManager.getInstance();
//
//   
//    /**
//     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //On récupère la session
//          String username = request.getParameter("username");
//      
//        
//        HttpSession session = request.getSession();
//        session.setAttribute("username",username);
//
//        //Si l'utilisateur n'est pas connecté, on le renvoit sur une page 404
//        if(session.getAttribute("id")!=null) {
//
//            //On vérifie si l'utilisateur existe
//            if(verifierExistenceUtilisateur(request.getParameter("id"))==false) {
//
//                //Si non, on redirige vers une page indiquant que l'utilisateur est inconnu
//                this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/afficherXProfil.jsp").forward(request, response);
//            }else {
//                try {
//
//                    //On envoie l'utilisateur recherché à la jsp
//                    request.setAttribute("utilisateur", utilisateurManager.select(Integer.valueOf(request.getParameter("id"))));
//
//                    //Si l'utilisateur connecté est le même que l'utilisateur recherché, on l'autorise à modifier
//                    if(request.getParameter("id").equals((session.getAttribute("id")))) {
//                        request.setAttribute("modifier", "oui");
//                    }
//
//                    //On redirige vers la jsp
//                    this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/afficherMonProfil.jsp").forward(request, response);
//                } catch (NumberFormatException e) {
//
//                    //On redirige vers une page indiquant que l'utilisateur est inconnu
//                    this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/afficherXProfil.jsp").forward(request, response);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }else {
//
//            //On redirige vers une page indiquant que l'utilisateur est inconnu
//            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/afficherXProfil.jsp").forward(request, response);
//        }
//    }
//
//    //Méthode vérifier Existence Utilisateur
//        private boolean verifierExistenceUtilisateur(String id) {
//            boolean existe=true;
//            try {
//                utilisateur = utilisateurManager.select(Integer.valueOf(id));
//                if(utilisateur.getPseudo()==null) {
//                    existe=false;
//                }
//            } catch (NumberFormatException e) {
//                existe=false;
//            } catch (Exception e) {
//                e.printStackTrace();
//                existe=false;
//            }
//            return existe;
//        };
//}
    
    
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/afficherMonProfil.jsp");
    rd.forward(request,response);
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

 

}