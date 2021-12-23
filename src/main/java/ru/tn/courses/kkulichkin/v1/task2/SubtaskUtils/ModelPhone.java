/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils;

import ru.tn.courses.kkulichkin.v1.task2.SubtaskUtils.AllEnums.Enums;


/**
 *
 * @author kkulichkin
 */
public class ModelPhone extends ModelItem
{
    private Enums.Os        os;
    private Enums.BrandName brand_name;
    private Enums.UsbPort   usb_port;
    private Enums.SimCard   sim_card;

    public ModelPhone(Enums.Os os, Enums.BrandName brand_name, Enums.UsbPort usb_port, Enums.SimCard sim_card, int id_new, int price_new, int count_new)
    {
        super(id_new, price_new, count_new);
        this.os = os;
        this.brand_name = brand_name;
        this.usb_port = usb_port;
        this.sim_card = sim_card;
    }
    

    public Enums.Os getOs()
    {
        return os;
    }

    public void setOs(Enums.Os os)
    {
        this.os = os;
    }

    public Enums.BrandName getBrandName()
    {
        return brand_name;
    }

    public void setBrandName(Enums.BrandName brand_name)
    {
        this.brand_name = brand_name;
    }

    public Enums.UsbPort getUsbPort()
    {
        return usb_port;
    }

    public void setUsbPort(Enums.UsbPort usb_port)
    {
        this.usb_port = usb_port;
    }

    public Enums.SimCard getSimCard()
    {
        return sim_card;
    }

    public void setSimCard(Enums.SimCard sim_card)
    {
        this.sim_card = sim_card;
    }

    
    public String toString() {
        return "Phone characteristics:" + 
                " Brand name : " + brand_name.getValue() + 
                "; OS: " + os.getValue() + 
                "; USB Port: " + usb_port.getValue() +
                "; SIM CARD: " + sim_card.getValue() + 
                "\n";
    }

    
}
