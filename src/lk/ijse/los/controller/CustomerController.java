
package lk.ijse.los.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.los.db.DBConnection;
import lk.ijse.los.modal.customer;



public class CustomerController {

    public boolean savePatient(customer p1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?)");
        stm.setString(1, p1.getCustomer_id());
        stm.setString(2, p1.getCustomer_name());
        stm.setString(3, p1.getMobile());
        stm.setString(4, p1.getAddress1());
        stm.setString(5, p1.getAddress2());
        stm.setString(6, p1.getCity());
        stm.setString(7, p1.getDistrict());
       
        return stm.executeUpdate()>0;
    }

    public customer getcustomer(String requestNic) throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.
                prepareStatement("SELECT * FROM customer WHERE  customer_id=+'"+requestNic+"'")
                .executeQuery();
        if(set.next()){
            return new customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7)
                  
            );
        }
        return null;
    }

    public boolean dropcustomer(String requestNIC) throws ClassNotFoundException, SQLException {
      
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM customer WHERE customer_id='"+requestNIC+"'")
                .executeUpdate()>0;
        
    
}
    public boolean updateState(customer p1) throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement stm=connection.prepareStatement("UPDATE customer SET customer_name=?, mobile=?,"
               + "address1=?, address2=?, city=?,district=? WHERE customer_id=?");
       stm.setObject(1, p1.getCustomer_name());
    
       stm.setObject(2, p1.getMobile());
       stm.setObject(3, p1.getAddress1());
       stm.setObject(4, p1.getAddress2());
       stm.setObject(5, p1.getCity());
       stm.setObject(6, p1.getCity());
      
       stm.setObject(7, p1.getCustomer_id());
       return stm.executeUpdate()>0;
    }

    public boolean dropBike(String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}