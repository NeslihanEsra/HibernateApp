/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author NEA
 */

@Entity
@Table(name="kullanici")
public class Kullanici extends BaseEntity{
    @Id
    @Column
    @SequenceGenerator(name = "seq_kullanici_id", allocationSize = 1, sequenceName = "seq_kullanici_id")
    @GeneratedValue(generator = "seq_kullanici_id", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "ad", length = 30)
    private String ad;
    @Column(name = "soyad", length = 30)
    private String soyad;
    @Column(name = "kullanici_adi", length = 30, unique = true)
    private String kullaniciAdi;
    @Column(name = "sifre", length = 30)
    private String sifre;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "tel", length = 30)
    private String tel;
    @Column(name = "adres", length = 30)
    private String adres;
//    @Column(name = "maas", scale = 2, precision = 14)
//    private BigDecimal maas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", kullaniciAdi=" + kullaniciAdi + ", sifre=" + sifre + ", email=" + email + ", tel=" + tel + ", adres=" + adres + '}';
    }
    
}
