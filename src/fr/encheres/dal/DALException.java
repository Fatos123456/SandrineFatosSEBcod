package fr.encheres.dal;

 

import java.sql.SQLException;

 

public class DALException extends Exception {

 

    public DALException(String string, SQLException e) {
    }

 

}