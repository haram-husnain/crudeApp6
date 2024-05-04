/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author pmp
 */
public class HomeBal {
    
    //method for inserting data
    
    public void insert(HomeBean homeBean){
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_app", "root", "qazwsx");
            String query = "insert into employee values (null, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, homeBean.getempId());
            ps.setString(2, homeBean.getfullName());
            ps.setString(3, homeBean.getemail());
            ps.setString(4, homeBean.getaddress());
            ps.setString(5, homeBean.getcontact());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
}
