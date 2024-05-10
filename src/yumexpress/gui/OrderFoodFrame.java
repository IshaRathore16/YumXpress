/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import yumexpress.dao.CompanyDAO;
import yumexpress.dao.ProductDAO;
import yumexpress.pojo.ProductPojo;
import yumexpress.utility.UserProfile;

/**
 *
 * @author Isha Rathore
 */
public class OrderFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrderFoodFrame
     */
    private JFrame showFrame=null;
    private int listIndex;
    private Map<String,String> companyMap;
    private List<ProductPojo> productList;
    public OrderFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello "+UserProfile.getUserName());
        loadCompanyNames();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcCompanyNames = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblProductImage1 = new javax.swing.JLabel();
        lblProductImage2 = new javax.swing.JLabel();
        lblProductImage3 = new javax.swing.JLabel();
        lblProductName1 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        lblProductName3 = new javax.swing.JLabel();
        lblProductImage4 = new javax.swing.JLabel();
        lblProductImage5 = new javax.swing.JLabel();
        lblProductImage6 = new javax.swing.JLabel();
        lblProductName4 = new javax.swing.JLabel();
        lblProductName5 = new javax.swing.JLabel();
        lblProductName6 = new javax.swing.JLabel();

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
        jButton3.setText("My Account");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 261, 220, 40));

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("My Cart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 170, 40));

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Cancel Order");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 220, 40));

        jButton10.setBackground(new java.awt.Color(255, 153, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Order History");
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 220, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 720));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Order Food");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 280, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("FILTER");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jcCompanyNames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcCompanyNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompanyNamesActionPerformed(evt);
            }
        });
        jPanel3.add(jcCompanyNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 160, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumexpress/icons/icons8-left-arrow-64 (1).png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumexpress/icons/icons8-right-arrow-64 (1).png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        lblProductImage1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage1.setText("jLabel4");
        lblProductImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 130));

        lblProductImage2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage2.setText("jLabel16");
        lblProductImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 130));

        lblProductImage3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage3.setText("jLabel17");
        lblProductImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 150, 130));

        lblProductName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName1.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName1.setText("jLabel18");
        lblProductName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 150, 30));

        lblProductName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName2.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName2.setText("jLabel19");
        lblProductName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 30));

        lblProductName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName3.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName3.setText("jLabel20");
        lblProductName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 150, 30));

        lblProductImage4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage4.setText("jLabel21");
        lblProductImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 150, 130));

        lblProductImage5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage5.setText("jLabel22");
        lblProductImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 150, 130));

        lblProductImage6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductImage6.setText("jLabel23");
        lblProductImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 150, 130));

        lblProductName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName4.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName4.setText("jLabel24");
        lblProductName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 150, 30));

        lblProductName5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName5.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName5.setText("jLabel25");
        lblProductName5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 150, 30));

        lblProductName6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductName6.setForeground(new java.awt.Color(255, 204, 102));
        lblProductName6.setText("jLabel26");
        lblProductName6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProduct(evt);
            }
        });
        jPanel3.add(lblProductName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 720, 720));

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

    private void jcCompanyNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompanyNamesActionPerformed
        // TODO add your handling code here:
        String compName=this.jcCompanyNames.getSelectedItem().toString();
        String compId =this.companyMap.get(compName);
        if(compId==null){
            compId="ALL";
        }
        try{
            this.productList=ProductDAO.getAllProductsByCompanyId(compId);
            showDetails();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB error in vieworderframe");
            ex.printStackTrace();
        }
         catch(IOException ex){
            JOptionPane.showMessageDialog(null,"DB error in vieworderframe");
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jcCompanyNamesActionPerformed

    private void lblOrderProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderProduct
        // TODO add your handling code here:
        JLabel lbl = (JLabel)evt.getSource();
        int index = Integer.parseInt(lbl.getName());
        System.out.println("You clicked on:" + index);
        if (index >=productList.size()) {
            JOptionPane.showMessageDialog(null, "Invalid item clicked");
            return;
        }
        String[] str = {"Add To Cart", "Buy Now"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want to do ?", "Select", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
        if (choice == 0) {
            // Code for add to cart
        } else {
            ProductPojo p = productList.get(index);
            showFrame = new OrderProductFrame(p);
            showFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblOrderProduct

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
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcCompanyNames;
    private javax.swing.JLabel lblProductImage1;
    private javax.swing.JLabel lblProductImage2;
    private javax.swing.JLabel lblProductImage3;
    private javax.swing.JLabel lblProductImage4;
    private javax.swing.JLabel lblProductImage5;
    private javax.swing.JLabel lblProductImage6;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductName3;
    private javax.swing.JLabel lblProductName4;
    private javax.swing.JLabel lblProductName5;
    private javax.swing.JLabel lblProductName6;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables

    private void loadCompanyNames() {
      try{
          this.companyMap=CompanyDAO.getAllCompanyIdAndName();
          Set<String>companyNames=companyMap.keySet();
          this.jcCompanyNames.addItem("ALL");
          for(String cname:companyNames){
              this.jcCompanyNames.addItem(cname);
          }
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB error in orderfoodframe");
          ex.printStackTrace();
      }
    }

    private void showDetails() {
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage1.getWidth(), lblProductImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage1.setIcon(icon);
            lblProductName1.setText(p.getProductName());
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage1.setIcon(null);
            lblProductImage1.setText("N/A");
            lblProductName1.setText("N/A");
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage2.getWidth(), lblProductImage2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductName2.setText(p.getProductName());
            lblProductImage2.setIcon(icon);
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage2.setIcon(null);
            lblProductImage2.setText("N/A");
            lblProductName2.setText("N/A");
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage3.getWidth(), lblProductImage3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage3.setIcon(icon);
            lblProductName3.setText(p.getProductName());
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage3.setIcon(null);
            lblProductImage3.setText("N/A");
            lblProductName3.setText("N/A");
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage4.getWidth(), lblProductImage4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage4.setIcon(icon);
            lblProductName4.setText(p.getProductName());
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage4.setIcon(null);
            lblProductImage4.setText("N/A");
            lblProductName4.setText("N/A");
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage5.getWidth(), lblProductImage5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage5.setIcon(icon);
            lblProductName5.setText(p.getProductName());
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage5.setIcon(null);
            lblProductImage5.setText("N/A");
            lblProductName5.setText("N/A");
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage6.getWidth(), lblProductImage6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage6.setIcon(icon);
            lblProductName6.setText(p.getProductName());
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        } else {
            lblProductImage6.setIcon(null);
            lblProductImage6.setText("N/A");
            lblProductName6.setText("N/A");
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        }
    }
}
