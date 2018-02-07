/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.model.enumeration;

/**
 *
 * @author NEA
 */
public enum OgrenimBilgisiEnum {
    ILKOKUL,
    ORTAOKUL,
    LISE,
    LISANS,
    YUKSEKLISANS,
    DOKTORA;            

    int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    
  
    
}


