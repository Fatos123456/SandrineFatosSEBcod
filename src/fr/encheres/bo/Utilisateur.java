/**
 * 
 */
package fr.encheres.bo;

/**
 * Classe d'un utilisateur
 * @author Sébastien
 *
 */
public class Utilisateur {
	
	private int id;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private int administrateur;
	private Article article;
	private Enchere enchere;


	/**
	 * 
	 */
	public Utilisateur() {
	}
	

	/**
	 * @param id
	 * Identifiant de l'utilisateur
	 * @param pseudo
	 * Pseudo de l'utilisateur
	 * @param nom
	 * Nom de l'utilisateur
	 * @param prenom
	 * Prénom de l'utilisateur
	 * @param email
	 * Email de l'utilisateur
	 * @param telephone
	 * Téléphone de l'utilisateur
	 * @param rue
	 * Nom de rue de l'utilisateur
	 * @param codePostal
	 * Code postal de l'utilisateur
	 * @param ville
	 * Ville de l'utilisateur
	 * @param motDePasse
	 * Mot de passe de l'utilisateur
	 * @param credit
	 * Nombre de crédit de l'utilisateur
	 * @param administrateur
	 * Numéro d'administrateur de l'utilisateur
	 * @param article
	 * Article mis en vente par l'utilisateur
	 * @param enchere
	 * Enchere fait par l'utilisateur
	 */
	public Utilisateur(int id, String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, int administrateur, Article article,
			Enchere enchere) {
		this.id = id;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.article = article;
		this.enchere = enchere;
	}

	


	/**
	 * @param id
	 * Identifiant de l'utilisateur
	 * @param pseudo
	 * Pseudo de l'utilisateur
	 * @param nom
	 * Nom de l'utilisateur
	 * @param prenom
	 * Prénom de l'utilisateur
	 * @param email
	 * Email de l'utilisateur
	 * @param telephone
	 * Téléphone de l'utilisateur
	 * @param rue
	 * Nom de rue de l'utilisateur
	 * @param codePostal
	 * Code postal de l'utilisateur
	 * @param ville
	 * Ville de l'utilisateur
	 * @param motDePasse
	 * Mot de passe de l'utilisateur
	 */
	public Utilisateur(int id, String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse) {
		this.id = id;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}


	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}
	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	/**
	 * @return the administrateur
	 */
	public int getAdministrateur() {
		return administrateur;
	}
	/**
	 * @param administrateur the administrateur to set
	 */
	public void setAdministrateur(int administrateur) {
		this.administrateur = administrateur;
	}
	
	
	
	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}


	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}


	/**
	 * @return the enchere
	 */
	public Enchere getEnchere() {
		return enchere;
	}


	/**
	 * @param enchere the enchere to set
	 */
	public void setEnchere(Enchere enchere) {
		this.enchere = enchere;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pseudo == null) ? 0 : pseudo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pseudo == null) {
			if (other.pseudo != null)
				return false;
		} else if (!pseudo.equals(other.pseudo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal=" + codePostal + ", ville="
				+ ville + ", motDePasse=" + motDePasse + ", credit=" + credit + ", administrateur=" + administrateur
				+ ", article=" + article + ", enchere=" + enchere + "]";
	}
	

}
