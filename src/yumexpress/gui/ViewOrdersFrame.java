/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yumexpress.dao.OrderDAO;
import yumexpress.pojo.OrderPojo;
import yumexpress.utility.UserProfile;

/**
 *
 * @author Isha Rathore
 */
public class ViewOrdersFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrdersFrame
     */
    private DefaultTableModel model; 
    private List<OrderPojo>orderList;
    
    public ViewOrdersFrame() {
        initComponents();
      
        this.setLocationRelativeTo(null);
           this.lblUserProfile.setText("Hello "+UserProfile.getUserName());
           model=(DefaultTableModel)this.jtOrderList.getModel();
        loadNewOrderDetails(UserProfile.getUserId().trim());
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
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUserProfile = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrderList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumexpress/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, -1));

        lblUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserProfile.setText("@null");
        jPanel2.add(lblUserProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 160, 60));

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Order History");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 220, 50));

        jButton5.setBackground(new java.awt.Color(255, 153, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Logout");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 551, 160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 720));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("View Orders");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 330, 90));

        jtOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Price", "Customer Name", "Customer Phone No", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtOrderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtOrderListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtOrderList);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, 620));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 660, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtOrderListMouseClicked
        // TODO add your handling code here:
        int index=this.jtOrderList.getSelectedRow();
        OrderPojo order=orderList.get(index);
        int actualOTP=order.getOtp();
        while(true){
        String strOTP=JOptionPane.showInputDialog("Please input OTP");
        if(strOTP==null)
            return;
        try{
        int userOTP=Integer.parseInt(strOTP);
        if(userOTP==actualOTP){
            boolean res=OrderDAO.confirmOrder(order.getOrderId());
            if(res==true){
                JOptionPane.showMessageDialog(null,"Order Delivered");
                model.removeRow(index);
                orderList.remove(index);
                if(orderList.isEmpty()){
                    JOptionPane.showMessageDialog(null,"All orders delivered");
                    this.dispose();
                    new DeliveryStaffOption().setVisible(true);
                    return;
                }
                return;
            }
            JOptionPane.showMessageDialog(null,"Order cannot be Confirmed");
        }else{
            JOptionPane.showMessageDialog(null,"Invalid OTP.Try Again");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error in ViewsOrderFrame");
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_jtOrderListMouseClicked

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
            java.util.logging.Logger.getLogger(ViewOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrdersFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtOrderList;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables

    private void loadNewOrderDetails(String staffId) {
        try{
            orderList=OrderDAO.getNewOrdersForStaff(staffId);
            if(orderList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No undelivered orders");
                return;
            }
            int i=0;
            Object []rows=new Object[5];
            while(i<orderList.size()){
                OrderPojo ord=orderList.get(i);
                rows[0]=ord.getProductName();
                rows[1]=ord.getProductPrice();
                rows[2]=ord.getCustomerName();
                rows[3]=ord.getCustomerPhoneNo();
                rows[4]=ord.getCustomerAddress();
                model.addRow(rows);
                i++;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error in ViewOrdersFrame");
            ex.printStackTrace();
        }
    }


}