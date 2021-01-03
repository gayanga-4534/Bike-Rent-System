/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.los.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.los.db.DBConnection;
import lk.ijse.los.modal.Bike;
import lk.ijse.los.modal.customer;


/**
 *
 * @author user
 */
public class BikeController {

    public boolean saveBike(Bike p1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO bike VALUES(?,?,?,?)");
        stm.setString(1, p1.getBike_id());
        stm.setString(2, p1.getM_id());
        stm.setString(3, p1.getBike_Name());
        stm.setString(4, p1.getAvailable());
       
       
        return stm.executeUpdate()>0;
    }

     public boolean dropBike(String requestNIC) throws ClassNotFoundException, SQLException {
      
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM bike WHERE Bike_id='"+requestNIC+"'")
                .executeUpdate()>0;
        
       
}

 

   
        

       public Bike getbike(String requestNic) throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.
                prepareStatement("SELECT * FROM bike WHERE  Bike_id=+'"+requestNic+"'")
                .executeQuery();
        if(set.next()){
            return new Bike(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
                  
            );
        }
        return null;
    }

    public Bike getBike(String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }



