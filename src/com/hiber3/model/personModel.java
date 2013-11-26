/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber3.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NUSNAFIF
 */
@Entity
@Table(name="t_person")
public class personModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int Id;
    
    @Column(name ="first_name")
    private String FirstName;
    
    @Column(name="last_name")
    private String LastName;
    
    @Column (name="idemail")
    private String idEmail;
        
    
//    private boolean data1;
//
//    public boolean isData1() {
//        return data1;
//    }
//
//    public void setData1(boolean data1) {
//        this.data1 = data1;
//    }
       

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(String idEmail) {
        this.idEmail = idEmail;
    }        
    
    
    
}
