/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;

import java.awt.Toolkit;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class HomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public HomeJFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        loadTable();
    }
    
    
    //method for load table...
    
    public void loadAllDataIntoTable(List<HomeBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (HomeBean bean : list) {
            Vector v = new Vector();
            v.add(bean.getid());
            v.add(bean.getname());
            v.add(bean.getemail());
            v.add(bean.getaddress());
            v.add(bean.getcontact());
            
            dtm.addRow(v);
        }
    }
    
    public void loadTable(){
        HomeBal bal = new HomeBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    public void clearTextFieldsData(){
        jTextFieldempId.setText("");
        jTextFieldfullName.setText("");
        jTextFieldemail.setText("");
        jTextFieldaddress.setText("");
        jTextFieldcontact.setText("");
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldcontact = new javax.swing.JTextField();
        jTextFieldempId = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jButtonupdate = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonsave = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextFieldfullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRUD Application");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 480, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 430, 10));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose one to report");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 180, 30));

        jComboBox1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Address", "Surname" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 160, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Go");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 120));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 960, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 960, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1000, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Contact No.");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 40));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 40));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 40));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Email");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 40));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Address");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 40));
        jPanel4.add(jTextFieldcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, 30));

        jTextFieldempId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldempIdActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldempId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 190, 30));
        jPanel4.add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, 30));
        jPanel4.add(jTextFieldaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        jButtonupdate.setBackground(new java.awt.Color(0, 102, 153));
        jButtonupdate.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 170, 50));

        jButtonclear.setBackground(new java.awt.Color(0, 102, 153));
        jButtonclear.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 170, 50));

        jButtonsave.setBackground(new java.awt.Color(0, 102, 153));
        jButtonsave.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtonsave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsave.setText("Save");
        jButtonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsaveActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 170, 50));

        jButtondelete.setBackground(new java.awt.Color(0, 102, 153));
        jButtondelete.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 50));

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Go");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 30));

        jTextFieldfullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfullNameActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldfullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 30));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("INFORMATION");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email", "Address", "Contact No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 127, 570, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldempIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldempIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldempIdActionPerformed

    private void jTextFieldfullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfullNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsaveActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldempId.getText();
        String fullName = jTextFieldfullName.getText();
        String email = jTextFieldemail.getText();
        String address = jTextFieldaddress.getText();
        String contact = jTextFieldcontact.getText();
        
        //object of homebean class
        HomeBean homeBean = new HomeBean(id, fullName, email, address, contact);
        
        //homeBal object
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homeBean);
        loadTable();
        clearTextFieldsData();
    }//GEN-LAST:event_jButtonsaveActionPerformed
    //int id = 0;
    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldempId.getText();
        String fullName = jTextFieldfullName.getText();
        String email = jTextFieldemail.getText();
        String address = jTextFieldaddress.getText();
        String contact = jTextFieldcontact.getText();
        HomeBean bean = new HomeBean(id, fullName, email, address, contact);
        HomeBal bal = new HomeBal();
        bal.updateData(bean);
        loadTable();
        clearTextFieldsData();
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
        } else{
            String id = (String) jTable1.getValueAt(row, 0);
            com.home.HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataTextField(id);
            jTextFieldempId.setText(bean.getid());
            jTextFieldfullName.setText(bean.getname());
            jTextFieldemail.setText(bean.getemail());
            jTextFieldaddress.setText(bean.getaddress());
            jTextFieldcontact.setText(bean.getcontact());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldempId.getText();
        HomeBal bal = new HomeBal();
        bal.deleteRecord(id);
        loadTable();
        clearTextFieldsData();
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        clearTextFieldsData();
    }//GEN-LAST:event_jButtonclearActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonsave;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldcontact;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldempId;
    private javax.swing.JTextField jTextFieldfullName;
    // End of variables declaration//GEN-END:variables
}
