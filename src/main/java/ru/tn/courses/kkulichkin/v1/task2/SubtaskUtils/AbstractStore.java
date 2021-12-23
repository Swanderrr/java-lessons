/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils;

import java.util.List;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;

/**
 *
 * @author kkulichkin
 */
public abstract class AbstractStore
{
    abstract ModelOrder openOrder(int item_id, String customer);
    abstract ModelOrder editOrder(int order_id, int item_id, Enums.OrderAction action);
    abstract ModelOrder checkoutOrder(int order_id);

    
    abstract List<ModelItem> showAll();
}
