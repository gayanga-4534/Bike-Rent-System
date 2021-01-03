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
public class booking {
   private String Booking_id;
   private String customer_id;
   private String fee;
   private String  date;
    private String due;

    public booking() {
    }

    public booking(String Booking_id, String customer_id, String fee, String date, String due) {
        this.Booking_id = Booking_id;
        this.customer_id = customer_id;
        this.fee = fee;
        this.date = date;
        this.due = due;
    }

    /**
     * @return the Booking_id
     */
    public String getBooking_id() {
        return Booking_id;
    }

    /**
     * @param Booking_id the Booking_id to set
     */
    public void setBooking_id(String Booking_id) {
        this.Booking_id = Booking_id;
    }

    /**
     * @return the customer_id
     */
    public String getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the due
     */
    public String getDue() {
        return due;
    }

    /**
     * @param due the due to set
     */
    public void setDue(String due) {
        this.due = due;
    }
    
}
