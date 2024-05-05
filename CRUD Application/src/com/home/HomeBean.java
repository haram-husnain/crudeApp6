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

    public String getempId() {
        return empId;
    }

    public void setempId(String empId) {
        this.empId = empId;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }
    
    
}
