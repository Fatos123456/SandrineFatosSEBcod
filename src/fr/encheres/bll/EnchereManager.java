package fr.encheres.bll;

 


import java.util.List;

 

import fr.encheres.bo.Enchere;
import fr.encheres.dal.DALException;
import fr.encheres.dal.DAOFactory;
import fr.encheres.dal.EnchereDAO;
import fr.encheres.exceptions.BusinessException;

 

public class EnchereManager {
    
    private EnchereDAO enchereDAO;
    
    public EnchereManager() {
        this.enchereDAO = DAOFactory.getEnchereDAO();
    }

 

    public List<Enchere> selectionnerEncheres() throws BusinessException {
        try {
            return this.enchereDAO.selectAll();
        } catch (DALException e) {
            e.printStackTrace();
            BusinessException b = new BusinessException("aucune enchère en base");
            throw b;
        } 
    }

 

}