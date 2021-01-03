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
public class BookingDetails {
 private String  bookingDetailId;
    private String   Booking_id  ; 
  private String  Bike_id ;      
   private String   BikePerDayPrice;     

    public BookingDetails() {
    }

    public BookingDetails(String bookingDetailId, String Booking_id, String Bike_id, String BikePerDayPrice) {
        this.bookingDetailId = bookingDetailId;
        this.Booking_id = Booking_id;
        this.Bike_id = Bike_id;
        this.BikePerDayPrice = BikePerDayPrice;
    }

    /**
     * @return the bookingDetailId
     */
    public String getBookingDetailId() {
        return bookingDetailId;
    }

    /**
     * @param bookingDetailId the bookingDetailId to set
     */
    public void setBookingDetailId(String bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
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
     * @return the BikePerDayPrice
     */
    public String getBikePerDayPrice() {
        return BikePerDayPrice;
    }

    /**
     * @param BikePerDayPrice the BikePerDayPrice to set
     */
    public void setBikePerDayPrice(String BikePerDayPrice) {
        this.BikePerDayPrice = BikePerDayPrice;
    }
    
}
