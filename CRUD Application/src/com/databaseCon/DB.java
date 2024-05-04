/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author pmp
 */
public class DB {
    
    public static Connection con = null;
    
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3306/crud_app";
        String root = "root";
        String pass = "qazwsx";
        
        try {
            con = DriverManager.getConnection(url, root, pass);
            
            if (con != null) {
                JOptionPane.showMessageDialog(null, "database has been successfully connected...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error in database loading "+e);
        }
    }
}
