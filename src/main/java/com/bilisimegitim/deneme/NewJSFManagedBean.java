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
@ManagedBean(name = "newJSFManagedBean")
@ViewScoped
public class NewJSFManagedBean {
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
    public NewJSFManagedBean() {
    }
    
}
