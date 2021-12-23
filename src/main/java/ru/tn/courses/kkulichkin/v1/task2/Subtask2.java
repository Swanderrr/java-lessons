/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2;

import java.util.Scanner;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb.CustomerDB;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb.OrderDB;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelCustomer;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.WebStore;

/**
 *
 * @author kkulichkin
 */
public class Subtask2
{
    public static void main(String[] args)
    {

        OrderDB    orderDB    = OrderDB.getInstance();
        CustomerDB customerDB = CustomerDB.getInstance();

        WebStore store  = new WebStore();
        
        Scanner scanner = new Scanner(System.in);
        
        store.openOrder(0, "Радион Р.");
        store.showAll();
        
        orderDB.findAll();
        
        store.editOrder(0, 1, Enums.OrderAction.ADD);
        store.checkoutOrder(0);
     
        customerDB.save(new ModelCustomer(customerDB.getSize(), "Орасио О.", +300));
    }
}
