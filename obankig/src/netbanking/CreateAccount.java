/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.util.logging.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author joy
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    static public String Ac;
    public  Connection connect;
    public CreateAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Date_of_Birth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        CheckButton = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        AccountType = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\All CSE File\\2nd Year 2nd Semester\\Project\\Net Banking\\Net-Banking-Software-main\\project2\\src\\project2\\Images\\icons8-circled-user-male-skin-type-1-2-100 (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 112, 109));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Insert Your Account Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\All CSE File\\2nd Year 2nd Semester\\Project\\Net Banking\\Net-Banking-Software-main\\project2\\src\\project2\\Images\\icons8-back-arrow-30.png")); // NOI18N
        jLabel3.setText("Go Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 119, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\All CSE File\\2nd Year 2nd Semester\\Project\\Net Banking\\Net-Banking-Software-main\\project2\\src\\project2\\Images\\icons8-close-window-30.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 0, 25, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        Name.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 237, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        PhoneNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 237, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Account Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        AccountNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        AccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNumberActionPerformed(evt);
            }
        });
        jPanel1.add(AccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 237, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date_of_Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        Date_of_Birth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Date_of_Birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_of_BirthActionPerformed(evt);
            }
        });
        jPanel1.add(Date_of_Birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 237, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 270, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 270, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 334, 47));

        CheckButton.setBackground(new java.awt.Color(0, 0, 255));
        CheckButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CheckButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckButton.setIcon(new javax.swing.ImageIcon("F:\\All CSE File\\2nd Year 2nd Semester\\Project\\Net Banking\\Net-Banking-Software-main\\project2\\src\\project2\\Images\\icons8-search-client-30.png")); // NOI18N
        CheckButton.setText("Check Details");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CheckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, 40));

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 262, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Account Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 100, -1));

        AccountType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current Account", "Savings Account", "Fixed Deposit Account", " " }));
        jPanel1.add(AccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberActionPerformed

    private void AccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNumberActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // TODO add your handling code here:
        //String PhoneNo=PhoneNumber.getText();
       // String IdNo=ID.getText();
       // String EmailN =Email.getText();
       // String AccN =AccountNumber.getText();
       // String pass=Password.getText();
        //String DofB=Date_of_Birth.getText();
       /* boolean Checker = true;
        
        if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==11){
            Checker=true;
            PhoneNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            PhoneNumber.setBackground(new Color(246, 53, 40));
        }
        
        if(IdNo.matches("^[0-9]*$") && IdNo.length()==10){
            Checker=true;
           ID.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            ID.setBackground(new Color(246, 53, 40));
        }
        
        
        // if(EmailN.matches("^[0-9]*$")){
         //   Checker=true;
         //  Email.setBackground(Color.GREEN);
      //  }
       // else{
        //    Checker=false;
         //   Email.setBackground(new Color(246, 53, 40));
       // }
         
         if(AccN.matches("^[0-9]*$") && AccN.length()==10){
            Checker=true;
           AccountNumber.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            AccountNumber.setBackground(new Color(246, 53, 40));
        }
        
        if(pass.matches("^[0-9]*$") && pass.length()==6){
            Checker=true;
            Password.setBackground(Color.GREEN);
        }
        else{
            Checker=false;
            Password.setBackground(new Color(246, 53, 40));
        }*/
        
        String CName=Name.getText();
        String Phone=PhoneNumber.getText();
        String AccNo=AccountNumber.getText();
        String DoB=Date_of_Birth.getText();
        String IDNo=ID.getText();
        String EmailNo=Email.getText();
        String Pass=Password.getText();
         String AcType =(String)AccountType.getSelectedItem();
        String Addrs=Address.getText();
       
        
     // Connection connect=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/OBank?zeroDateTimeBehavior=convertToNull","root","");
            Statement st=connect.createStatement();
             String insert="INSERT INTO customer VALUES('"+CName+"','"+Phone+"','"+AccNo+"','"+DoB+"','"+IDNo+"','"+EmailNo+"','"+Pass+"','"+AcType+"','"+Addrs+"')";
          
            st.executeUpdate(insert);
                    JOptionPane.showConfirmDialog(null,"Successfully Updated");                 
                    setVisible(false);
                    new AccountSuccessful().setVisible(true);
                   //  AccountCreat Ac=new AccountCreat();
       // setVisible(false);
       // Ac.setVisible(true);
        dispose();
        }
                   // PreparedStatement pst = connect.prepareStatement(insert);
                   // ResultSet rs = st.executeQuery(insert);
                   // JOptionPane.showConfirmDialog(null,"Successfully Updated");
                     //if(rs.next()){
                         // Ac=  AccountNumber.getText();
                          
                          //try{
                             //  String query2 = "Select * from logindetail where AccNo='"+AccNo+"'";
                               
                   // PreparedStatement ps = connect.prepareStatement(query2);
                    //ps.setString(1, AccountNumber.getText());
                    // Statement st=connect.createStatement();
                   // ResultSet rt = st.executeQuery(query2);
                    //if(rt.next()){
                       // JOptionPane.showMessageDialog(null, "You Have Alreay Created Account please login or Call to Bank");
                       // setVisible(false);
                       // new Login().setVisible(true);
                       // dispose();
                  //  }
                          //}
                          //(Exception e){
                             //  JOptionPane.showMessageDialog(null, e);
                          //}
                    // }
                //     //else{
                //JOptionPane.showMessageDialog(null, "Invalid Credential ! Please Enter Valid Detail Or Call To Bank");

           // }
                   //   JOptionPane.showConfirmDialog(null,"Successfully Updated");
                    //setVisible(false);
                    //new AccountCreat().setVisible(true);
                    // AccountCreat Ac=new AccountCreat();
       // setVisible(false);
        //Ac.setVisible(true);
        //dispose();
           // connect.close();
            
         catch (Exception e) {
             JOptionPane.showConfirmDialog(null,"Connection Error");
        }
            
       
        
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void Date_of_BirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_of_BirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_of_BirthActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new CreateAccount().setVisible(true);
          }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNumber;
    private javax.swing.JComboBox<String> AccountType;
    private javax.swing.JTextField Address;
    private javax.swing.JButton CheckButton;
    private javax.swing.JTextField Date_of_Birth;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
