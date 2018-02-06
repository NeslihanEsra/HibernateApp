/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.model;

import com.nea.hibernateexample.service.KullaniciService;
import java.util.List;

/**
 *
 * @author NEA
 */
public class Runner {
    public static void main(String[] args) {
        KullaniciService kullaniciService = new KullaniciService();
        List<Kullanici> list = kullaniciService.getAll();
        for (Kullanici kullanici : list) {
            System.out.println(kullanici.toString());
        }
    }
}
