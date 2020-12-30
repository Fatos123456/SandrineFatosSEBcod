package fr.encheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.encheres.BusinessException;
import fr.encheres.bo.Utilisateur;
import fr.encheres.dal.CodesResultatDAL;


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String INSERT_UTILISATEUR ="insert into utilisateurs(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur)"
													+ "values(?,?,?,?,?,?,?,?,?,?,?)";

	private static final String CONNEXION = "select no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville from utilisateurs where (pseudo=?) AND (mot_de_passe=?)";
	
	
	
	public void creer(Utilisateur utilisateur) {
	
	try(Connection cnx = ConnectionProvider.getConnection())
	{
		try
		{
			//Commencer une requête pour insérer les données remplies par l'utilisateur au moment de l'inscription en base de données
			
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.setInt(11, utilisateur.getAdministrateur());
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			
			//Ajouter un numéro d'utilisateur (identifiant) pour chaque inscription
			if(rs.next())
			{
				utilisateur.setId(rs.getInt(1));
			}
			rs.close();
			pstmt.close();
				
			} catch (SQLException e) {
			e.printStackTrace();
			}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
	
		}


	@Override
	public Utilisateur connexion(String pseudo, String motDePasse) throws Exception {

		// instancie a null l'utilisateur, pseudo et mot de passe
		 Utilisateur utilisateur = null;
		 
        //Créer la connexion et démarre la requête pour récupérer le pseudo et le mot de passe de l'utilisateur en base de données
		 
        try (Connection cnx = ConnectionProvider.getConnection()) {
        PreparedStatement pstmt = cnx.prepareStatement(CONNEXION);
        pstmt.setString(1, pseudo);         
        pstmt.setString(2, motDePasse);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
	         utilisateur = new Utilisateur
	         (rs.getInt("no_utilisateur"), rs.getString("pseudo"), rs.getString("nom"),
	         rs.getString("prenom"), rs.getString("email"), rs.getString("telephone"), rs.getString("rue"),
	         rs.getString("code_postal"), rs.getString("ville"), null);
	     	}

        //Si cela ne fonctionne pas afficher une erreur à l'utilisateur
        
         } catch (Exception e) {
	        e.printStackTrace();
         	}
        
		return utilisateur;
        
     
	}


	// on crée la requete de modification de l'utilisateur
		private static final String MODIFIER_UTILISATEUR = "UPDATE UTILISATEURS SET mot_de_passe=? WHERE no_utilisateur=4";

		public void modifier(Utilisateur utilisateur) {

			try (Connection cnx = ConnectionProvider.getConnection()) {
				try {

					PreparedStatement pstmt = cnx.prepareStatement(MODIFIER_UTILISATEUR,
							PreparedStatement.RETURN_GENERATED_KEYS);
				
					pstmt.setString(1, utilisateur.getMotDePasse());
				
	//pstmt.setInt(11, utilisateur.getId() );

					pstmt.executeUpdate();
					ResultSet rs = pstmt.getGeneratedKeys();
					if (rs.next()) {
						utilisateur.setId(rs.getInt(1));
					}
					rs.close();
					pstmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

	//on crée la requete de selectionner un utilisateur

		private static final String SELECT_UILISATEUR = "SELECT*FROM UTILISATEURS where no_utilisateur=4";

		@Override
		public List<Utilisateur> select() throws BusinessException {
			List<Utilisateur> utilisateur = new ArrayList<Utilisateur>();
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_UILISATEUR);

				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					Utilisateur lesUtilisateurs = new Utilisateur();

					lesUtilisateurs = utilisateurBuilder(rs);
					utilisateur.add(lesUtilisateurs);

				}
			} catch (SQLException e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				businessException.ajouterErreur(CodesResultatDAL.LECTURE_UTILISATEUR_ECHEC);
				throw businessException;
			}
			return utilisateur;
		}

		private Utilisateur utilisateurBuilder(ResultSet rs) throws SQLException {
			Utilisateur lesUtilisateurs;
			lesUtilisateurs = new Utilisateur();
			lesUtilisateurs.setPseudo(rs.getString("pseudo"));
			lesUtilisateurs.setNom(rs.getString("nom"));
			lesUtilisateurs.setPrenom(rs.getString("prenom"));
			lesUtilisateurs.setEmail(rs.getString("email"));
			lesUtilisateurs.setTelephone(rs.getString("telephone"));
			lesUtilisateurs.setRue(rs.getString("rue"));
			lesUtilisateurs.setCodePostal(rs.getString("code_postal"));
			lesUtilisateurs.setVille(rs.getString("ville"));
			lesUtilisateurs.setMotDePasse(rs.getString("mot_de_passe"));
			lesUtilisateurs.setCredit(rs.getInt("credit"));
			lesUtilisateurs.setAdministrateur(rs.getInt("administrateur"));
			return lesUtilisateurs;
		}

	 

   
	
}
