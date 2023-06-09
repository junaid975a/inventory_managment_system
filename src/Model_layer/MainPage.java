/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model_layer;
import DataAccess_layer.CloseButtonAction;
import Service_layer.MainPage_service;
import java.sql.*;
/**
 *
 * @author Junaid Ansari
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_item_btn = new javax.swing.JButton();
        edit_quant_btn = new javax.swing.JButton();
        view_inv_btn = new javax.swing.JButton();
        edit_quant_btn1 = new javax.swing.JButton();
        gen_bill_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(73, 113, 116));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 350));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GROCERY STORE");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("©your_market.com all copyrights reserved 2022 inc.");

        jPanel2.setBackground(new java.awt.Color(214, 228, 229));

        add_item_btn.setBackground(new java.awt.Color(73, 113, 116));
        add_item_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_item_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_item_btn.setText("ADD ITEM");
        add_item_btn.setToolTipText("");
        add_item_btn.setBorder(null);
        add_item_btn.setBorderPainted(false);
        add_item_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_item_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_item_btnMouseClicked(evt);
            }
        });
        add_item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_item_btnActionPerformed(evt);
            }
        });

        edit_quant_btn.setBackground(new java.awt.Color(73, 113, 116));
        edit_quant_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_quant_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_quant_btn.setText("EDIT ITEM");
        edit_quant_btn.setToolTipText("");
        edit_quant_btn.setBorder(null);
        edit_quant_btn.setBorderPainted(false);
        edit_quant_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_quant_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_quant_btnMouseClicked(evt);
            }
        });
        edit_quant_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_quant_btnActionPerformed(evt);
            }
        });

        view_inv_btn.setBackground(new java.awt.Color(73, 113, 116));
        view_inv_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_inv_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_inv_btn.setText("VIEW INVENTORY");
        view_inv_btn.setToolTipText("");
        view_inv_btn.setBorder(null);
        view_inv_btn.setBorderPainted(false);
        view_inv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_inv_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_inv_btnMouseClicked(evt);
            }
        });
        view_inv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_inv_btnActionPerformed(evt);
            }
        });

        edit_quant_btn1.setBackground(new java.awt.Color(73, 113, 116));
        edit_quant_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_quant_btn1.setForeground(new java.awt.Color(255, 255, 255));
        edit_quant_btn1.setText("UPDATE USER");
        edit_quant_btn1.setToolTipText("");
        edit_quant_btn1.setBorder(null);
        edit_quant_btn1.setBorderPainted(false);
        edit_quant_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_quant_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_quant_btn1MouseClicked(evt);
            }
        });
        edit_quant_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_quant_btn1ActionPerformed(evt);
            }
        });

        gen_bill_btn.setBackground(new java.awt.Color(73, 113, 116));
        gen_bill_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gen_bill_btn.setForeground(new java.awt.Color(255, 255, 255));
        gen_bill_btn.setText("GENERATE BILL");
        gen_bill_btn.setToolTipText("");
        gen_bill_btn.setBorder(null);
        gen_bill_btn.setBorderPainted(false);
        gen_bill_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gen_bill_btn.setFocusPainted(false);
        gen_bill_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gen_bill_btnMouseClicked(evt);
            }
        });
        gen_bill_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_bill_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit_quant_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_item_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view_inv_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(gen_bill_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_quant_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gen_bill_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view_inv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_quant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_quant_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(214, 228, 229));

        jLabel3.setFont(new java.awt.Font("Elephant", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("One stop shop for all your needs");

        jLabel5.setBackground(new java.awt.Color(214, 228, 229));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Junaid Ansari\\Documents\\NetBeansProjects\\SuperMarket\\img\\bag.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        close.setBackground(new java.awt.Color(73, 113, 116));
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\Junaid Ansari\\Documents\\NetBeansProjects\\IMBS\\src\\imbs\\cross.png")); // NOI18N
        close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.setBorderPainted(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gen_bill_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_bill_btnActionPerformed
//        gb.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_gen_bill_btnActionPerformed

    private void add_item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_item_btnActionPerformed
//        ai.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_add_item_btnActionPerformed

    private void edit_quant_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_quant_btnActionPerformed
//        ei.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_edit_quant_btnActionPerformed

    private void view_inv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_inv_btnActionPerformed
//        inv.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_view_inv_btnActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        CloseButtonAction cba=new CloseButtonAction();
    }//GEN-LAST:event_closeMouseClicked

    private void edit_quant_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_quant_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_quant_btn1ActionPerformed

    private void gen_bill_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gen_bill_btnMouseClicked
        // TODO add your handling code here:
        GenerateBill obj = new GenerateBill();
        obj.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_gen_bill_btnMouseClicked

    private void view_inv_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_inv_btnMouseClicked
        // TODO add your handling code here:
        ViewInventory obj = new ViewInventory();
        obj.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_view_inv_btnMouseClicked

    private void add_item_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_item_btnMouseClicked
        // TODO add your handling code here:
        AddItems obj = new AddItems();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_item_btnMouseClicked

    private void edit_quant_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_quant_btnMouseClicked
        // TODO add your handling code here:
        EditItem obj = new EditItem();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_edit_quant_btnMouseClicked

    private void edit_quant_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_quant_btn1MouseClicked
        // TODO add your handling code here:
        UpdateUser obj = new UpdateUser();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_edit_quant_btn1MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        
        MainPage_service mps=new MainPage_service();
        if(mps.logout()==1) {
            new Login().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_logoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_item_btn;
    private javax.swing.JButton close;
    private javax.swing.JButton edit_quant_btn;
    private javax.swing.JButton edit_quant_btn1;
    private javax.swing.JButton gen_bill_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logout;
    private javax.swing.JButton view_inv_btn;
    // End of variables declaration//GEN-END:variables
}
