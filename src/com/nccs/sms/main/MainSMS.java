/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.sms.main;
import com.nccs.sms.gui.LoginDialog;
import javax.swing.UIManager;
/**
 *
 * @author isan_
 */
public class MainSMS {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginDialog ld = new LoginDialog();
        ld.setLocationRelativeTo(null);
        ld.setResizable(false);
        ld.setVisible(true);
    }
}
