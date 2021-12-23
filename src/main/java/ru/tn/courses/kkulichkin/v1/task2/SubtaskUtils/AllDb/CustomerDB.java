/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb;

import java.util.ArrayList;
import java.util.List;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelCustomer;

/**
 *
 * @author kkulichkin
 */
public class CustomerDB extends AbstractDB<ModelCustomer>
{
    private static CustomerDB instance;

    public static CustomerDB getInstance()
    {
        if (instance == null)
        {
            instance = new CustomerDB();
        }
        return instance;
    }

    public CustomerDB()
    {
        super(new ArrayList<>());
        save(new ModelCustomer(getSize(), "Радион Р.", -300));
    }

    public ModelCustomer findByName(String name)
    {
        List<ModelCustomer> customers_all = findAll();
        for (ModelCustomer customer_cur : customers_all)
        {
            if (customer_cur.getName().equals(name)) return customer_cur;
        }
        return null;
    }
    
}
