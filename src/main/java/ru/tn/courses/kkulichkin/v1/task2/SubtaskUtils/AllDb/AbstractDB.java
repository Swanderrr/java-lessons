/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb;

import java.util.List;

/**
 *
 * @author kkulichkin
 */
public class AbstractDB<T>
{
    private List<T> database;

    public AbstractDB(List<T> database)
    {
        this.database = database;
    }
    
    public List<T> findAll()
    {
        return database;
    }

    public void save(T var)
    {
        database.add(var);
    }

    public void update(T var, int id)
    {
        database.set(id, var);
    }

    public T findById(int id)
    {
        return database.get(id);
    }

    public int getSize()
    {
        return database.size();
    }
}
