/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.los.view;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BookingViewsNew extends javax.swing.JPanel {

    /**
     * Creates new form BookingViewsNew
     */
    public BookingViewsNew() {
        initComponents();
    
 
        initComponents();
        LoadCarId();
        txtcustname.setEnabled(false);
       txtcustomerid.setEnabled(false);
       txtbookingid.setEnabled(false);
       txtfee.setEnabled(false);
       txtdate.setEnabled(false);
       txtdue.setEnabled(false);
    }

    
     public void LoadCarId(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/losrent","root","ijse");
             PreparedStatement pst = con. prepareStatement("select * from bike");
             ResultSet rs=pst.executeQuery();
             cmbbikeno.removeAllItems();
             while(rs.next()){
              cmbbikeno.addItem(rs.getString(1));  
             }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtbookingid = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtcustomerid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtfee = new javax.swing.JTextField();
        txtdue = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtdate = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbbikeno = new javax.swing.JComboBox<>();
        txtavl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcustname = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Booking");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 165, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Customer Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 160, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 80, 440, 10));

        txtbookingid.setBorder(null);
        jPanel2.add(txtbookingid, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 50, 430, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 453, 10));

        txtcustomerid.setBorder(null);
        txtcustomerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcustomeridKeyPressed(evt);
            }
        });
        jPanel2.add(txtcustomerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 444, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 450, 10));

        txtfee.setBorder(null);
        jPanel2.add(txtfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 270, 440, 30));

        txtdue.setBorder(null);
        jPanel2.add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 444, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 460, 10));

        txtdate.setBorder(null);
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 460, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 453, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel11.setText("Sol");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 70));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel14.setText("Bike");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 100));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel15.setText("Rent");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Bike No");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 166, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Fee");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 166, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Due");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 166, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 166, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Beautiful_Suzuki_GSX_R_Sport_Bike_Wallpaper.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 370, 760));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 380, 130, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Booking Id");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 166, -1));

        cmbbikeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbikenoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbbikeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 440, -1));

        txtavl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtavl.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(txtavl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 100, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Customer Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, -1));

        txtcustname.setBorder(null);
        txtcustname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcustnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtcustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 444, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 453, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1280, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcustomeridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustomeridKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String cust_id=txtcustomerid.getText();
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/losrent","root","ijse");
                PreparedStatement pst = con. prepareStatement("select * from customer where customer_id=?");

                pst.setString(1, cust_id);
                ResultSet rs=pst.executeQuery();
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this, "Customer not found");
                }else{
                    String aval=rs.getString("customer_name");
                    txtcustname.setText(aval.trim());
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtcustomeridKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
            // TODO add your handling code here:
            //ok buttun
            String bookingid=txtbookingid. getText();
            String bike_no=cmbbikeno.getSelectedItem().toString();
           
            String cust_id=txtcustomerid. getText();
            
            String fee=txtfee. getText();
            
//            SimpleDateFormat Date_Format=new SimpleDateFormat("yyyy-MM-dd");
//            String date =Date_Format.format(txtdate.getText());
//            SimpleDateFormat Date_Format1=new SimpleDateFormat("yyyy-MM-dd");
//            String due =Date_Format.format(txtdue.getText());

             String date=txtdate. getText();
               String due=txtdue. getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/losrent","root","ijse");
            PreparedStatement pst = con. prepareStatement("insert into booking( Booking_id,Bike_id,customer_id,fee,date,due)values(?,?,?,?,?,?) ");
            pst.setString(1,bookingid);
            pst.setString(2,bike_no);
           
            pst.setString(3,cust_id);
            pst.setString(4,fee);
            
          pst.setString(5,date);
           pst.setString(6,due);
           pst.executeUpdate();
           //rental table>>>>>>>bikeregistration update
          PreparedStatement pst1 = con. prepareStatement("update  bike set available='no' where   Bike_id=?");
         pst1.setString(1,bike_no);
          pst1.executeUpdate();
        JOptionPane.showMessageDialog(this,"success");
           } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        }     
     //////
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbbikenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbikenoActionPerformed
        // TODO add your handling code here:

        String bike_no=cmbbikeno.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/losrent","root","ijse");
            PreparedStatement pst = con. prepareStatement("select * from bike where Bike_id =?");
            pst.setString(1, bike_no);
            ResultSet rs=pst.executeQuery();

            if(rs.next()==false){
                JOptionPane.showMessageDialog(this, "Car no not found");
            }else{
                String aval=rs.getString("available");
                txtavl.setText(aval.trim());
                if(aval.equals("yes")){
                    txtcustomerid.setEnabled(true);
                    txtcustname.setEnabled(true);
                    txtbookingid.setEnabled(true);
                    txtfee.setEnabled(true);
                    txtdate.setEnabled(true);
                    txtdue.setEnabled(true);
                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookingViewsNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbbikenoActionPerformed

    private void txtcustnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustnameKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcustnameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbbikeno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtavl;
    private javax.swing.JTextField txtbookingid;
    private javax.swing.JTextField txtcustname;
    private javax.swing.JTextField txtcustomerid;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtfee;
    // End of variables declaration//GEN-END:variables
}