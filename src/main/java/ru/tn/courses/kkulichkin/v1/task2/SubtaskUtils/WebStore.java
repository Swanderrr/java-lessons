/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils;

import java.util.ArrayList;
import java.util.List;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb.CustomerDB;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb.ItemDB;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb.OrderDB;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;

/**
 *
 * @author kkulichkin
 */
public class WebStore extends AbstractStore
{
    CustomerDB customerDB = CustomerDB.getInstance();
    OrderDB    orderDB    = OrderDB.getInstance();
    ItemDB     itemDB     = ItemDB.getInstance();
    
    public ModelOrder openOrder(int item_id, String customer_name)
    {
        ModelCustomer customer = customerDB.findByName(customer_name);
        ModelItem item         = itemDB.findById(item_id);
        ModelOrder order       = new ModelOrder(orderDB.getSize(), Enums.OrderStatus.OPEN, customer);
        orderDB.save(order);
        return order;
    }

    public ModelOrder checkoutOrder(int order_id)
    {
        ModelOrder order = orderDB.findById(order_id);
        
        order.setStatus(Enums.OrderStatus.CHECKOUT);
        
        ModelCustomer customer    = customerDB.findById(order.getCustomer().getId());
        ArrayList<ModelItem> items = order.getItems();
        
        int order_price = 0;
        for(ModelItem item_cur : items)
        {
            if (item_cur.getCount() > 0)
            {
                item_cur.setCount(item_cur.getCount() - 1);
                order_price += item_cur.getPrice();
            }
            
            itemDB.update(item_cur, item_cur.getId());
        }
        

        order.setPayment(order_price);
        customer.setMoney(customer.getMoney() - order_price);
        
        customerDB.update(customer, customer.getId());

        return order;
    }

    public ModelOrder editOrder(int order_id, int item_id, Enums.OrderAction action)
    {
        ModelItem  item_new = itemDB.findById(item_id);
        ModelOrder order    = orderDB.findById(order_id);
        
        
        switch(action)
        {
            case ADD:    order.addItem(item_new);   break;
            case REMOVE: order.removeItem(item_new);break;
        }
        
        return order;
    }

    public List<ModelItem> showAll(){return itemDB.findAll();}


}

