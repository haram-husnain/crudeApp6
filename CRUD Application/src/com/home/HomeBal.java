/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

/**
 *
 * @author pmp
 */
public class HomeBal {
    
    //method for load read data from employee...
    public List<HomeBean> loadData() {
        List<HomeBean> list = new ArrayList<HomeBean>();
        try{
            String query = "select * from employee";
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                HomeBean bean = new HomeBean(id, name, email, address, contact);
                list.add(bean);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    //method for inserting data

    public void insert(HomeBean homeBean){
        
        try{
            String query = "insert into employee values (?, ?, ?, ?, ?)";
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
            ps.setString(1, homeBean.getid());
            ps.setString(2, homeBean.getname());
            ps.setString(3, homeBean.getemail());
            ps.setString(4, homeBean.getaddress());
            ps.setString(5, homeBean.getcontact());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //method for updating data
    public HomeBean returnAllDataTextField(String id){
        HomeBean bean = null;
        try {
            String query = "select * from employee where Id = "+id;
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ids = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                bean = new HomeBean(ids, name, email, address, contact);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    public void updateData(HomeBean bean) {
        try {
            String query = "update employee set name = ?, email = ?, address = ?, contact = ? where id = ?";
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
            ps.setString(1, bean.getname());
            ps.setString(2, bean.getemail());
            ps.setString(3, bean.getaddress());
            ps.setString(4, bean.getcontact());
            ps.setString(5, bean.getid());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public void deleteRecord(String id) {
        try {
            String query = "delete from employee where ID = ?";
            PreparedStatement ps = com.databaseCon.DB.con.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been deleted...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
}
