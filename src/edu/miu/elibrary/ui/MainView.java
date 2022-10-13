/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.miu.elibrary.ui;

import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.controller.SystemController;

import javax.swing.*;

/**
 *
 * @author Kuylim Tith
 */
public class MainView extends javax.swing.JFrame {

    private SystemController controller;

    /**
     * Creates new form MainView
     */
    public MainView() {
        controller = new SystemController();
        initComponents();

        lstMember.setModel(controller.getLibraryMemberListModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMember = new javax.swing.JTabbedPane();
        panelMember = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMember = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtMemberFirstname = new javax.swing.JTextField();
        txtMemberLastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMemberPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tabBook = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstMember.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstMember);

        jLabel1.setText("Firstname");

        jLabel2.setText("Lastname");

        txtMemberPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberPhoneActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone Number");

        javax.swing.GroupLayout panelMemberLayout = new javax.swing.GroupLayout(panelMember);
        panelMember.setLayout(panelMemberLayout);
        panelMemberLayout.setHorizontalGroup(
            panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemberLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMemberLayout.createSequentialGroup()
                        .addComponent(txtMemberFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        panelMemberLayout.setVerticalGroup(
            panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemberLayout.createSequentialGroup()
                .addGroup(panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMemberLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMemberLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMemberFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtMemberLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        tabMember.addTab("Libary Member", panelMember);

        javax.swing.GroupLayout tabBookLayout = new javax.swing.GroupLayout(tabBook);
        tabBook.setLayout(tabBookLayout);
        tabBookLayout.setHorizontalGroup(
            tabBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        tabBookLayout.setVerticalGroup(
            tabBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        tabMember.addTab("Book", tabBook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMember)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMember)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberPhoneActionPerformed

    private void lstMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMemberMouseClicked
        selectedListMember();
    }//GEN-LAST:event_lstMemberMouseClicked

    private void selectedListMember() {
        LibraryMember libraryMember = lstMember.getSelectedValue();
        txtMemberFirstname.setText(libraryMember.getFirstName());
        txtMemberLastname.setText(libraryMember.getLastName());
        txtMemberPhone.setText(libraryMember.getPhoneNumber());
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<LibraryMember> lstMember;
    private javax.swing.JPanel panelMember;
    private javax.swing.JPanel tabBook;
    private javax.swing.JTabbedPane tabMember;
    private javax.swing.JTextField txtMemberFirstname;
    private javax.swing.JTextField txtMemberLastname;
    private javax.swing.JTextField txtMemberPhone;
    // End of variables declaration//GEN-END:variables
}
