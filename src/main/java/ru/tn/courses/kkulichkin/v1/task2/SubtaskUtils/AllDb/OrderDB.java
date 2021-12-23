/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb;

import java.util.ArrayList;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelOrder;

/**
 *
 * @author kkulichkin
 */
public class OrderDB extends AbstractDB<ModelOrder>
{

    private static OrderDB instance;

    public static OrderDB getInstance()
    {
        if(instance == null)
        {
            instance = new OrderDB();
        }
        return instance;
    }

    public OrderDB()
    {
        super(new ArrayList<>());
    }
}    
