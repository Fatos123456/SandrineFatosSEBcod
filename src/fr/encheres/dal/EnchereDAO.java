package fr.encheres.dal;

 

import java.util.List;

 

import fr.encheres.bo.Enchere;

 

public interface EnchereDAO {
    

 

    List<Enchere> selectAll() throws DALException;

 

}