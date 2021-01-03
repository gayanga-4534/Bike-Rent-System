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
public class model {
   private String m_id;
   private String make;   
   private String model_Name  ; 
      private String  available;

    public model() {
    }

    public model(String m_id, String make, String model_Name, String available) {
        this.m_id = m_id;
        this.make = make;
        this.model_Name = model_Name;
        this.available = available;
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
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model_Name
     */
    public String getModel_Name() {
        return model_Name;
    }

    /**
     * @param model_Name the model_Name to set
     */
    public void setModel_Name(String model_Name) {
        this.model_Name = model_Name;
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
