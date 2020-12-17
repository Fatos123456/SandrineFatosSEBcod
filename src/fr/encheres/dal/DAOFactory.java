package fr.encheres.dal;

public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO()
	{
		return new UtilisateurDAOJdbcImpl();
	}
	

	public static UtilisateurDAO getUtilisateurDAOJdbcImpl() {
		return new UtilisateurDAOJdbcImpl();
	}
	
	  public static EnchereDAO getEnchereDAO() {
	        return new EnchereDAOJdbcImpl();
	    }
}

