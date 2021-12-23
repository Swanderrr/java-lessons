/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllDb;

import java.util.ArrayList;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelItem;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelPhone;

/**
 *
 * @author kkulichkin
 */
public class ItemDB extends AbstractDB<ModelItem>
{

    private static ItemDB instance;
    public  static ItemDB getInstance()
    {
        if(instance == null)
        {
            instance = new ItemDB();
        }
        return instance;
    }

    private ItemDB()
    {
        super(new ArrayList<>());
        save(
                new ModelPhone(
                        Enums.Os.IOS, 
                        Enums.BrandName.APPLE, 
                        Enums.UsbPort.NONE, 
                        Enums.SimCard.NANO, 
                        0, 
                        321, 
                        1));
        save(
                new ModelPhone(
                        Enums.Os.ANDROID, 
                        Enums.BrandName.SAMSUNG, 
                        Enums.UsbPort.TYPEC, 
                        Enums.SimCard.MICRO, 
                        1, 
                        77, 
                        443));
        save(
                new ModelPhone(
                        Enums.Os.SAILFISH, 
                        Enums.BrandName.HUAWEI, 
                        Enums.UsbPort.TYPEB, 
                        Enums.SimCard.MINI, 
                        2, 
                        123, 
                        55));
        save(
                new ModelPhone(
                        Enums.Os.TIZEN, 
                        Enums.BrandName.NOKIA, 
                        Enums.UsbPort.TYPEA, 
                        Enums.SimCard.FULL, 
                        3, 
                        559, 
                        123));
    }
}