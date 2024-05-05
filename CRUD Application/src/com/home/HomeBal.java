/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author pmp
 */
public class HomeBal {
    
    //method for inserting data
    
    public void insert(HomeBean homeBean){
        
        try{
            String query = "insert into employee values (?, ?, ?, ?, ?)";
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
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
