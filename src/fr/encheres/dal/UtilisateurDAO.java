package fr.encheres.dal;

import java.util.List;

import fr.encheres.BusinessException;
import fr.encheres.bo.Utilisateur;

public interface UtilisateurDAO {

	public void creer (Utilisateur utilisateur);
	
	public Utilisateur connexion(String pseudo, String motDePasse) throws Exception;

	public void modifier(Utilisateur utilisateur) throws BusinessException;

	public List<Utilisateur> select() throws BusinessException;


}
