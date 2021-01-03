
package lk.ijse.los.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.los.db.DBConnection;


public class DashBoardController {

    public int getConfirmedCount() throws ClassNotFoundException, SQLException {
       
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM bike").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;   
    }

    /**
     *
     * @return
     */
   
          public int getcustomerCount() throws ClassNotFoundException, SQLException {
       
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM customer").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;   
    }
    }


       

