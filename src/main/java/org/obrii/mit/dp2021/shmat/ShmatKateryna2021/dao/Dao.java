package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao;

import java.util.ArrayList;

public interface Dao<T>{
    void create(T entity);
    T findById(int id);
    ArrayList<T> findAll();
    void update(T entity);
    void delete(int id);
}