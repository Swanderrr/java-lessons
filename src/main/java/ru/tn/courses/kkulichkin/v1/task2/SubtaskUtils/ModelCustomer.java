/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils;

/**
 *
 * @author kkulichkin
 */
public class ModelCustomer
{
    int id;
    int money;
    String name;
    
    public int getId()
    {
        return id;
    }
    
    

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public ModelCustomer(int id, String name, int money)
    {
        this.id    = id;
        this.name  = name;
        this.money = money;
    }
}
