/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.los.modal;

/**
 *
 * @author user
 */
public class Bike {

    private String Bike_id;
    private String m_id;
    private String Bike_Name;
    private String available;

    public Bike() {
    }

    public Bike(String Bike_id, String m_id, String Bike_Name, String available) {
        this.Bike_id = Bike_id;
        this.m_id = m_id;
        this.Bike_Name = Bike_Name;
        this.available = available;
    }

    public Bike(String Bike_id, String Bike_Name, String available) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the Bike_id
     */
    public String getBike_id() {
        return Bike_id;
    }

    /**
     * @param Bike_id the Bike_id to set
     */
    public void setBike_id(String Bike_id) {
        this.Bike_id = Bike_id;
    }

    /**
     * @return the m_id
     */
    public String getM_id() {
        return m_id;
    }

    /**
     * @param m_id the m_id to set
     */
    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    /**
     * @return the Bike_Name
     */
    public String getBike_Name() {
        return Bike_Name;
    }

    /**
     * @param Bike_Name the Bike_Name to set
     */
    public void setBike_Name(String Bike_Name) {
        this.Bike_Name = Bike_Name;
    }

    /**
     * @return the available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(String available) {
        this.available = available;
    }

}
