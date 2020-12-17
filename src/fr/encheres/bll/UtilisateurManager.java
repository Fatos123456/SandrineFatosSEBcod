package fr.encheres.bll;


import java.util.List;

import fr.encheres.BusinessException;
import fr.encheres.bo.Utilisateur;
import fr.encheres.dal.DAOFactory;
import fr.encheres.dal.UtilisateurDAO;


public class UtilisateurManager extends Utilisateur {

	
		private UtilisateurDAO utilisateurDAO;
			
		
		public UtilisateurManager() {
			this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
		}


		public Utilisateur creer(String pseudo, String nom, String prenom, String email, String telephone,
				String rue, String codePostal, String ville, String motDePasse) {
			
			Utilisateur utilisateur = null;
			
			utilisateur = new Utilisateur();
			utilisateur.setPseudo(pseudo);
			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setEmail(email);
			utilisateur.setTelephone(telephone);
			utilisateur.setRue(rue);
			utilisateur.setCodePostal(codePostal);
			utilisateur.setVille(ville);
			utilisateur.setMotDePasse(motDePasse);
				
			this.utilisateurDAO.creer(utilisateur);
			
			return utilisateur;
		}


		public Utilisateur connexion(String pseudo, String motDePasse) {

			Utilisateur utilisateur = null;
			try {
				utilisateur = utilisateurDAO.connexion(pseudo, motDePasse);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return utilisateur;
		}
	
		
		public List<Utilisateur> select() throws BusinessException {

			return this.utilisateurDAO.select();
		}

		public Utilisateur modifier(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) throws BusinessException {

			Utilisateur utilisateur = null;

			utilisateur = new Utilisateur();
			utilisateur.setPseudo(pseudo);
			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setEmail(email);
			utilisateur.setTelephone(telephone);
			utilisateur.setRue(rue);
			utilisateur.setCodePostal(codePostal);
			utilisateur.setVille(ville);
			utilisateur.setMotDePasse(motDePasse);

			this.utilisateurDAO.modifier(utilisateur);

			return utilisateur;
		}
		
}
