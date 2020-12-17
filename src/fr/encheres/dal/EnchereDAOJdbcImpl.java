package fr.encheres.dal;

 

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 

import fr.encheres.bo.Enchere;

 

public class EnchereDAOJdbcImpl implements EnchereDAO {
    private static final String sqlSelectAll="select * from encheres";

 

    
    public List<Enchere> selectAll() throws DALException {

 

        Connection cnx=null;
        Statement rqt = null;
        ResultSet rs=null;
        List<Enchere> liste=new ArrayList<Enchere>();
        try {
            cnx=ConnectionProvider.getConnection();
            rqt=cnx.createStatement();
            rs=rqt.executeQuery(sqlSelectAll);
            Enchere enchere=null;
            
            while(rs.next()) {
                    enchere=new Enchere(rs.getDate("date_enchere").toLocalDate(),rs.getInt("montant_enchere"));
                }
                liste.add(enchere);
            
        }catch (SQLException e) {
            throw new DALException("selectAll failed -", e);
        }finally {            
            if(cnx!=null) {
                try {
                    if(rqt != null) {
                        rqt.close();
                    }
                    cnx.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            }
        }
    return liste;

 

    }

 

}