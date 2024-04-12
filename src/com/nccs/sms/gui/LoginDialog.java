/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.sms.gui;

import com.nccs.sms.database.ConnectionFactory;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author isan_
 */
public class LoginDialog extends javax.swing.JFrame {

    /**
     * Creates new form LoginDialog
     */
    public LoginDialog() {
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

        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        loginBttn = new javax.swing.JButton();
        resetBttn = new javax.swing.JButton();
        cancelBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLbl.setText("Username");

        passwordLbl.setText("Password");

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        loginBttn.setText("Login");
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        resetBttn.setText("Reset");
        resetBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBttnActionPerformed(evt);
            }
        });

        cancelBttn.setText("Cancel");
        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(usernameLbl)
                            .addGap(18, 18, 18)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(passwordLbl)
                            .addGap(18, 18, 18)
                            .addComponent(passwordTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBttn)
                        .addGap(18, 18, 18)
                        .addComponent(resetBttn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBttn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBttn)
                    .addComponent(resetBttn)
                    .addComponent(cancelBttn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void cancelBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelBttnActionPerformed

    private void resetBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBttnActionPerformed
        usernameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_resetBttnActionPerformed

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        String username = usernameTxt.getText();
        String password = new String(passwordTxt.getPassword());
        if(new ConnectionFactory().checkLogin(username,password)){
            Dashboard db = new Dashboard();
            Toolkit theKit = db.getToolkit();
            Dimension dim = theKit.getScreenSize();
            db.setSize(dim);
            db.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"unauthorized user");
            LoginDialog l = new LoginDialog();
            l.setVisible(true);
            l.setResizable(false);
            l.setLocationRelativeTo(null);
            dispose();
        }
        
    }//GEN-LAST:event_loginBttnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBttn;
    private javax.swing.JButton loginBttn;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton resetBttn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
