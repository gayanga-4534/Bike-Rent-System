
package lk.ijse.los.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.los.db.DBConnection;


public class LoginController {

    public boolean checkPassward(String trim, String text) throws ClassNotFoundException, SQLException {

        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
                ("Select * from Login where username ='"+trim+"'and passward = '"+text+"'").executeQuery();
        
        if(set.next())
        {
            return true;
        }
        return false;

    }
    
      
    
}
