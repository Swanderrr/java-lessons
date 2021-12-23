/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums;

import java.nio.channels.CancelledKeyException;

/**
 *
 * @author kkulichkin
 */
public class Enums
{
    public enum SimCard
    {
        FULL("Fullsize"),
        MINI("Minisized"),
        MICRO("Microsized"),
        NANO("Nanosized");
        
        private final String value;
        SimCard(String value){this.value = value;}
        public String getValue(){return value;}
        
    }
    
    public enum Os
    {
        ANDROID("Android"),
        IOS("IOS"),
        TIZEN("Tizen"),
        SAILFISH("Sailfish");
        
        private final String value;
        Os(String value){this.value = value;}
        public String getValue(){return value;}
        
    }
    
    public enum BrandName
    {
        SAMSUNG("Samsung"),
        APPLE("Apple"),
        HUAWEI("Huawei"),
        NOKIA("Nokia");
        
                
        private final String value;
        BrandName(String value){this.value = value;}
        public String getValue(){return value;}
    }
    
    public enum UsbPort
    {
        TYPEC("Type-C"),
        TYPEA("Type-A"),
        TYPEB("Type-B"),
        NONE("None");
        
        private final String value;
        UsbPort(String value){this.value = value;}
        public String getValue(){return value;}
    }
    
    public enum OrderStatus
    {
        OPEN,
        CLOSED,
        CANCELED,
        CHECKOUT,
    }
    
    public enum OrderAction
    {
        ADD,
        REMOVE,
    }
    
    
    
    
}


