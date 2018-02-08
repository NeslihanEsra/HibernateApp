/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.service;

import com.nea.hibernateexample.db.IService;
import com.nea.hibernateexample.db.MyHibernateUtil;
import com.nea.hibernateexample.model.Kullanici;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NEA
 */
public class KullaniciService implements IService<Kullanici> {

    @Override
    public Kullanici insert(Kullanici entity) {
        return (Kullanici) baseService.insert(entity);
    }

    @Override
    public Kullanici update(Kullanici entity) {
        return (Kullanici) baseService.update(entity);
    }

    @Override
    public Boolean delete(Kullanici entity) {
        return baseService.delete(entity);
    }

    @Override
    public List<Kullanici> getAll() {
        Criteria criteria = baseService.getSession().createCriteria(Kullanici.class);
        return criteria.list();
    }

    public List<Kullanici> getAllById(Long id) {
        Criteria criteria = baseService.getSession().createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        return (List<Kullanici>) criteria.uniqueResult();
    }

    public List<Kullanici> getUsernameAndPassword(String kullaniciAdi, String sifre) {
        Criteria criteria = baseService.getSession().createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("kullaniciAdi", kullaniciAdi));
        criteria.add(Restrictions.eq("sifre", sifre));
        return (List<Kullanici>) criteria.uniqueResult();
    }

    //Restriction işlemleri
//    public  List<Kullanici> getRestriction(){
//        Session session = MyHibernateUtil.getSessionFactory().openSession();        
//        Criteria criteria = session.createCriteria(Restrictions.and(Restrictions.eq("ad", ad),Restrictions.eq("soyad", soyad)));
//        Criteria criteria = session.createCriteria(Restrictions.ilike("ad", ad, MatchMode.ANYWHERE));
//        Criteria c = session.createCriteria(Restrictions.ge("id", 100));
//        return criteria.list();
//    }
    
    //sql oluşturma
    // Criteria criteria = session.createCriteria(Restrictions.sqlRestriction("id>10 and ad='ali'"));
    // projection  
    // criteria.setProjection(Projections.max("id"));
    // pagination   
    // criteria.setFirstResult(20);
    // criteria.setMaxResults(10);
}
