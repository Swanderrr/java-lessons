/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2;

import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;
import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.ModelPhone;

/**
 *
 * @author kkulichkin
 */
public class Subtask1
{
    public static void main(String[] arg)
    {
        ModelPhone phone_new = new ModelPhone(
            Enums.Os.IOS, 
            Enums.BrandName.APPLE, 
            Enums.UsbPort.NONE, 
            Enums.SimCard.NANO, 
            9256, 12345, 334
        );
        
        
        System.err.println(phone_new.toString());
        
        
    }
    
    

    
    
    
    
    
    
}
