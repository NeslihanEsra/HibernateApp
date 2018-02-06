/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author NEA
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Column(name = "update_by", length = 30)
    private String ekleyen; 
    @Column(name = "created_by", length = 30)
    private String guncelleyen;
    @Column(name = "update_at")
    private Date eklemeTarihi;
    @Column(name = "created_at")
    private Date guncellemeTarihi;
    @Column(name = "recors_state")
    private Boolean kayıtDurumu;

    
    public String getEkleyen() {
        return ekleyen;
    }

    public void setEkleyen(String ekleyen) {
        this.ekleyen = ekleyen;
    }

    
    public String getGuncelleyen() {
        return guncelleyen;
    }

    public void setGuncelleyen(String guncelleyen) {
        this.guncelleyen = guncelleyen;
    }

    public Date getEklemeTarihi() {
        return eklemeTarihi;
    }

    public void setEklemeTarihi(Date eklemeTarihi) {
        this.eklemeTarihi = eklemeTarihi;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public Boolean getKayıtDurumu() {
        return kayıtDurumu;
    }

    public void setKayıtDurumu(Boolean kayıtDurumu) {
        this.kayıtDurumu = kayıtDurumu;
    }
}
