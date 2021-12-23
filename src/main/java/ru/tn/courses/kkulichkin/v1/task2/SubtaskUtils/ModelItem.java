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
public class ModelItem 
{

    private int id;
    private int price;
    private int count;
    
    public ModelItem(int id_new, int price_new, int count_new)
    {
        id    = id_new;
        price = price_new;
        count = count_new;
    }
    
    public int getId()
    {
        return id;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }


    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
    
}
