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
public class Payment {
    private String p_id;
   private String Booking_id;
           private String return_date;
           private String days;
                   private String fine;

    public Payment() {
    }

    public Payment(String p_id, String Booking_id, String return_date, String days, String fine) {
        this.p_id = p_id;
        this.Booking_id = Booking_id;
        this.return_date = return_date;
        this.days = days;
        this.fine = fine;
    }

    /**
     * @return the p_id
     */
    public String getP_id() {
        return p_id;
    }

    /**
     * @param p_id the p_id to set
     */
    public void setP_id(String p_id) {
        this.p_id = p_id;
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
     * @return the return_date
     */
    public String getReturn_date() {
        return return_date;
    }

    /**
     * @param return_date the return_date to set
     */
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    /**
     * @return the days
     */
    public String getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * @return the fine
     */
    public String getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(String fine) {
        this.fine = fine;
    }
                   
}
