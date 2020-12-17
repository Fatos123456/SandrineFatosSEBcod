/**
 * 
 */
package fr.encheres.bo;

/**
 * Classe définissant la catégorie d'un article mis en enchère
 * @author Sébastien
 *
 */
public class Categorie {

	private int noCategorie;
	private String libelle;
	
	
	
	/**
	 * 
	 */
	public Categorie() {
	}



	/**
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(int noCategorie, String libelle) {
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}



	/**
	 * @return the noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}



	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}



	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}



	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noCategorie;
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
		Categorie other = (Categorie) obj;
		if (noCategorie != other.noCategorie)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}
	
	
	
}
