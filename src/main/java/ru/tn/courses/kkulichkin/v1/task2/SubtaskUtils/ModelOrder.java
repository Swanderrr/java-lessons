/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils;

import java.util.ArrayList;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;

/**
 *
 * @author kkulichkin
 */
public class ModelOrder
{
    
    private int id;
    private int payment;
    private Enums.OrderStatus status;
    
    private ModelCustomer customer;
    private ArrayList<ModelItem> items = new ArrayList<ModelItem>();

    public ModelOrder(int id, Enums.OrderStatus status, ModelCustomer customer)
    {
        this.id = id;
        this.status = status;
        this.customer = customer;
    }
    
    public int getPayment()
    {
        return payment;
    }

    public void setPayment(int payment)
    {
        this.payment = payment;
    }
    
    public ModelCustomer getCustomer()
    {
        return customer;
    }
        
    
    public void setCustomer(ModelCustomer customer)
    {
        this.customer = customer;
    }
    
    public ArrayList<ModelItem> getItems()
    {
        return items;
    }
    
    public void addItem(ModelItem item_new)
    {
        items.add(item_new);
    }
    
    public void removeItem(ModelItem item_new)
    {
        items.remove(item_new);
    }
    
    public Enums.OrderStatus getStatus()
    {
        return status;
    }
    
    public void setStatus(Enums.OrderStatus status_new)
    {
        status = status_new;
    }

}
