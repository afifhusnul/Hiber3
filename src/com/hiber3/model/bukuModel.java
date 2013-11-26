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
@Table(name="t_buku")
public class bukuModel implements Serializable {
    
    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Integer Id;
    
    @Column(name="judul_buku")
    private String JudulBuku;
    
    @Column(name="harga")
    private float HrgBuku;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getJudulBuku() {
        return JudulBuku;
    }

    public void setJudulBuku(String JudulBuku) {
        this.JudulBuku = JudulBuku;
    }

    public float getHrgBuku() {
        return HrgBuku;
    }

    public void setHrgBuku(float HrgBuku) {
        this.HrgBuku = HrgBuku;
    }
    
    
}