/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.deneme;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ridvan
 */
@ManagedBean(name = "customer")
@ViewScoped
public class Customer {
    private String tckn;
    private String name;
    private String surname;
    private Date date;
    private String home;
    private String work;
    private String gender;
    private String status;
    private String mail;
    private String fon1;
    private String fon2;
    private String fax;
    private String notes;
    
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public Customer() {
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHome() {
        return home;
    }
/*counter="counter" maxlength="10" counterTemplate="{0} characters remaining." */
    public void setHome(String home) {
        this.home = home;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFon1() {
        return fon1;
    }

    public void setFon1(String fon1) {
        this.fon1 = fon1;
    }

    public String getFon2() {
        return fon2;
    }

    public void setFon2(String fon2) {
        this.fon2 = fon2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
