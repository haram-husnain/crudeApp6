/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

/**
 *
 * @author pmp
 */
public class HomeBean {
    private String empId;
    private String fullName;
    private String email;
    private String address;
    private String contact;
    
    //constructor

    public HomeBean(String empId, String fullName, String email, String address, String contact) {
        this.empId = empId;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.contact = contact;
    }
    
    // getter and setter methods

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
