/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nea.hibernateexample.db;

import java.util.List;

/**
 *
 * @author NEA
 */
public interface IService<T> {
    BaseService baseService = new BaseService();
    
    T insert (T entity);
    T update (T entity);
    Boolean delete(T entity);
    List<T> getAll();
}
