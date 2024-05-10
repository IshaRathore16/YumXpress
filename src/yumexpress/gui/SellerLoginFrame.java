/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import yumexpress.dao.CompanyDAO;
import yumexpress.pojo.CompanyPojo;
import yumexpress.utility.OwnerProfile;
import yumexpress.utility.PasswordEncryption;

/**
 *
 * @author Isha Rathore
 */
public class SellerLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form SellerLoginFrame
     */
    public SellerLoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblregisterimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBack = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(167, 135, 208));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seller Login ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 330, 80));

        lblregisterimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumexpress/icons/seller.png"))); // NOI18N
        jPanel2.add(lblregisterimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 330, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Enter Company Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 226, -1));
        jPanel1.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 315, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Enter Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 176, -1));

        txtBack.setBackground(new java.awt.Color(142, 112, 179));
        txtBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBack.setForeground(new java.awt.Color(255, 255, 255));
        txtBack.setText("Back");
        jPanel1.add(txtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 121, 60));

        btnLogin.setBackground(new java.awt.Color(142, 112, 179));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 123, 60));

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(120, 41, 145));
        btnNew.setText("<html><u>New Seller Register Here</u></html>");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        SellerRegisterFrame rf=new SellerRegisterFrame();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null,"Company Name/Password cannot be left blank");
            return;
        }
        try{
            String compName=txtCompanyName.getText().trim();
            String password=String.valueOf(this.txtPassword.getPassword()).trim();
            password=PasswordEncryption.getEncryptedPassword(password);
            CompanyPojo comp=CompanyDAO.validate(compName, password);
            if(comp==null){
                JOptionPane.showMessageDialog(null,"Invalid UserId/Password.Try Again");
                return;
            }
            OwnerProfile.setCompanyId(comp.getCompanyId());
            OwnerProfile.setCompanyName(comp.getCompanyName());
            OwnerProfile.setOwnerName(comp.getOwnerName());
            SellerOptionFrame optionsFrame=new SellerOptionFrame();
            optionsFrame.setVisible(true);
            this.dispose();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error in SellerLoginFrame");
            ex.printStackTrace();
            return;
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed
    private boolean validateInputs(){
        if(this.txtCompanyName.getText().trim().isEmpty()||String.valueOf(this.txtPassword.getPassword()).trim().isEmpty())
            return false;
        return true;
    }
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
            java.util.logging.Logger.getLogger(SellerLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblregisterimg;
    private javax.swing.JButton txtBack;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
