/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.los.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.los.db.DBConnection;
import lk.ijse.los.modal.Bike;

/**
 *
 * @author user
 */
public class TotalBikeCustomerController {
        public List<Bike> getAllBike() throws ClassNotFoundException, SQLException {
        Connection connection
                = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM bike")
                .executeQuery();
        List<Bike> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new Bike(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
                   
            ));
        }
return tempList;
    }

}

