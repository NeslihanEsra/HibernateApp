/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.db;

import com.nea.hibernateexample.model.BaseEntity;
import java.util.Date;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author NEA
 */
public class BaseService {

    public Object insert(Object object) {
        if(object instanceof BaseEntity){
            BaseEntity baseEntity = (BaseEntity)object;
            baseEntity.setGuncelleyen("test");
            baseEntity.setGuncellemeTarihi(new Date());
        }
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
        return object;
    }

    public Object update(Object object) {
        if (object instanceof BaseEntity) {
            BaseEntity baseEntity = (BaseEntity) object;
            baseEntity.setGuncelleyen("test");
            baseEntity.setGuncellemeTarihi(new Date());
        }
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
        return object;
    }

    public Boolean delete(Object object) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
        return Boolean.TRUE;
    }

    public List getAll(Class cls) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(cls);
        List list = criteria.list();
        session.close();
        return list;
    }

    public Session getSession() {
        return MyHibernateUtil.getSessionFactory().openSession();
    }

}
