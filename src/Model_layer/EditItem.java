/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model_layer;

import DataAccess_layer.CloseButtonAction;
import DataAccess_layer.EditItem_DataAccess;
import Service_layer.EditItem_service;
import DB_classes.Item;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Junaid Ansari
 */
public class EditItem extends javax.swing.JFrame {

    /**
     * Creates new form EditItem
     */
    public EditItem() {
        initComponents();
    }
    
    public void show(int x) {
        if(x==1)
            JOptionPane.showMessageDialog(this, "This item is not Available");   
        else if(x==2)
            JOptionPane.showMessageDialog(this, "Select the Item to be Deleted"); 
        else if(x==3)
            JOptionPane.showMessageDialog(this, "Please fill the Details");     
        return;
    }
    
    
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchedItem = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        prod_quantity = new javax.swing.JTextField();
        prod_name = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        prod_price = new javax.swing.JTextField();
        prod_id = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchID = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        inv_back = new javax.swing.JButton();
        cross = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(73, 113, 116));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(512, 357));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("EDIT ITEMS");
        jLabel25.setToolTipText("");
        jLabel25.setAlignmentY(0.0F);
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel10.setBackground(new java.awt.Color(214, 228, 229));

        searchedItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        searchedItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchedItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchedItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchedItem);

        deleteBtn.setBackground(new java.awt.Color(73, 113, 116));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(null);
        deleteBtn.setBorderPainted(false);
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        modifyBtn.setBackground(new java.awt.Color(73, 113, 116));
        modifyBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modifyBtn.setForeground(new java.awt.Color(255, 255, 255));
        modifyBtn.setText("MODIFY");
        modifyBtn.setBorder(null);
        modifyBtn.setBorderPainted(false);
        modifyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyBtnMouseClicked(evt);
            }
        });
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(73, 113, 116));
        jLabel34.setText("Item quantity : ");

        prod_quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_quantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prod_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_quantityActionPerformed(evt);
            }
        });

        prod_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prod_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_nameActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(73, 113, 116));
        jLabel32.setText("Item name : ");

        prod_price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_price.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prod_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_priceActionPerformed(evt);
            }
        });

        prod_id.setEditable(false);
        prod_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        prod_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_idActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(73, 113, 116));
        jLabel33.setText("Item price: ");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(73, 113, 116));
        jLabel31.setText("Item ID : ");

        searchBtn.setBackground(new java.awt.Color(73, 113, 116));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.setBorder(null);
        searchBtn.setBorderPainted(false);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        searchID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(73, 113, 116));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(73, 113, 116));
        jLabel44.setText("Enter item ID to be modified :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(prod_id, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(prod_price)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prod_name, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prod_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prod_price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        inv_back.setBackground(new java.awt.Color(73, 113, 116));
        inv_back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Junaid Ansari\\Documents\\NetBeansProjects\\IMBS\\src\\imbs\\back-arrow.png")); // NOI18N
        inv_back.setBorderPainted(false);
        inv_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inv_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inv_backMouseClicked(evt);
            }
        });
        inv_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv_backActionPerformed(evt);
            }
        });

        cross.setBackground(new java.awt.Color(73, 113, 116));
        cross.setIcon(new javax.swing.ImageIcon("C:\\Users\\Junaid Ansari\\Documents\\NetBeansProjects\\IMBS\\src\\imbs\\cross.png")); // NOI18N
        cross.setBorderPainted(false);
        cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        cross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("©your_market.com all copyrights reserved 2022 inc.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(inv_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cross)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cross, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inv_back)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inv_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv_backActionPerformed
        
    }//GEN-LAST:event_inv_backActionPerformed

    private void searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDActionPerformed
        
    }//GEN-LAST:event_searchIDActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
              
        EditItem_service eis=new EditItem_service();
        Item it=eis.search(searchID.getText());

        DefaultTableModel m = (DefaultTableModel) searchedItem.getModel();        
        m.setRowCount(0);
        m.addRow(new Object[] {
            it.get_id(),it.get_name(),it.get_price(),it.get_quant()
        });        
    }//GEN-LAST:event_searchBtnMouseClicked

    
    private void searchedItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchedItemMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)searchedItem.getModel();
        int myItem = searchedItem.getSelectedRow();
        prod_id.setText(model.getValueAt(myItem, 0).toString());
        prod_name.setText(model.getValueAt(myItem, 1).toString());
        prod_price.setText(model.getValueAt(myItem, 2).toString());
        prod_quantity.setText(model.getValueAt(myItem, 3).toString());
    }//GEN-LAST:event_searchedItemMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        
        EditItem_service eis=new EditItem_service();
        if(eis.delete(searchID.getText())==1) {                                    
                
                DefaultTableModel model = (DefaultTableModel) searchedItem.getModel();
                model.setRowCount(0);
                
                prod_id.setText("");
                prod_name.setText("");
                prod_price.setText("");
                prod_quantity.setText("");
                JOptionPane.showMessageDialog(this, "Item Deleted");     
        }                    
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void prod_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_idActionPerformed

    private void prod_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_priceActionPerformed

    private void prod_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_nameActionPerformed

    private void prod_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_quantityActionPerformed

    private void modifyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyBtnMouseClicked
               
        EditItem_service eis=new EditItem_service();
        Item it=eis.modify(searchID.getText(), prod_name.getText(), prod_price.getText(), prod_quantity.getText());        
        
        if(it!=null) {
            DefaultTableModel m = (DefaultTableModel) searchedItem.getModel();
            m.setRowCount(0);
            m.addRow(new Object[] {
                it.get_id(),it.get_name(),it.get_price(),it.get_quant()
            });

            JOptionPane.showMessageDialog(this, "Item Updated"); 

            prod_id.setText("");
            prod_name.setText("");
            prod_price.setText("");
            prod_quantity.setText("");
        }         
    }//GEN-LAST:event_modifyBtnMouseClicked

    private void crossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crossActionPerformed

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        CloseButtonAction cba=new CloseButtonAction();
    }//GEN-LAST:event_crossMouseClicked

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void inv_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inv_backMouseClicked
        
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inv_backMouseClicked

    
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cross;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton inv_back;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JTextField prod_id;
    private javax.swing.JTextField prod_name;
    private javax.swing.JTextField prod_price;
    private javax.swing.JTextField prod_quantity;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchID;
    private javax.swing.JTable searchedItem;
    // End of variables declaration//GEN-END:variables
}
