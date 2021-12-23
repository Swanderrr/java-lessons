/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task3.SubtaskUtils;

/**
 *
 * @author kkulichkin
 */
public class MyInteger
{
    
    int value;

    public MyInteger()
    {
        value = 0;
    }
    
    
    public MyInteger(int value_new)
    {
        value = value_new;
    }
    
    public MyInteger(char[] value_new)
    {
        int value_temp = 0;
        
        int sign_char = 0;
        int sign = 1;
        boolean is_signed = false;
        
        
        char first_char = value_new[0];
        if(first_char == '-' || first_char == '+') is_signed = true;
        if(first_char == '-') sign = -1;
        if(first_char == '+') sign =  1;
        
        if(is_signed) sign_char = 1;
        else          sign_char = 0;
        
   
        int digit_power = 0;
        for(int i = value_new.length - 1; i >= sign_char; i--)
        {
            int char_cur  = value_new[i];
            int digit_cur = 0;
            
            switch(char_cur)
            {
                case '0': digit_cur = 0; break;
                case '1': digit_cur = 1; break;
                case '2': digit_cur = 2; break;
                case '3': digit_cur = 3; break;
                case '4': digit_cur = 4; break;
                case '5': digit_cur = 5; break;
                case '6': digit_cur = 6; break;
                case '7': digit_cur = 7; break;
                case '8': digit_cur = 8; break;
                case '9': digit_cur = 9; break;
            }
            
            int digit_modifier;
            if(digit_power == 0)
            {
                digit_modifier = 1;
            }
            else
            {
                digit_modifier = 1;
                for(int j = 0; j < digit_power; j++) digit_modifier *= 10;  
            }
            
              
            int digit_positioned = digit_cur * digit_modifier;
            
            value_temp += digit_positioned;
            
            
            digit_power += 1; 
        }
        
        value = value_temp * sign;
    }
    
    public void setValue(int value_new)
    {
        value = value_new;
    }
    
    
    
    public int intValue()
    {
        return value;
    }
    
    public void addInt(MyInteger integer)
    {
        value += integer.intValue();
    }
    
    public void subInt(MyInteger integer)
    {
        value -= integer.intValue();
    }
    
    public void divInt(MyInteger integer)
    {
        value /= integer.intValue();
    }
    
    public void mulInt(MyInteger integer)
    {
        value *= integer.intValue();
    }
    
    public void pow(int power)
    {
        int value_base = value;
        int value_new  = value_base;
        while(power-- > 0) value_new *= value_base;
        value = value_new;
    }
    
    
    public boolean equals(MyInteger obj)
    {
        if(obj instanceof MyInteger) return value == ((MyInteger)obj).intValue();
        return false;
    }
    
    
    public char[] toHexString()
    {
        int value_base      = value;
        int value_remainder = 0;
        int value_quotient  = 0;
        
        
        char[] value_hex = {'0', '0', '0', '0', '0', '0', '0', '0'};
        
        
        int iteration_cur = 0;
        do
        {
            char char_cur = '0';
            
            
            value_remainder = value_base % 16;
            value_base /= 16;
            
            switch(value_remainder)
            {
                case 0: char_cur = '0'; break;
                case 1: char_cur = '1'; break;
                case 2: char_cur = '2'; break;
                case 3: char_cur = '3'; break;
                case 4: char_cur = '4'; break;
                case 5: char_cur = '5'; break;
                case 6: char_cur = '6'; break;
                case 7: char_cur = '7'; break;
                case 8: char_cur = '8'; break;
                case 9: char_cur = '9'; break;
                case 10: char_cur = 'A'; break;
                case 11: char_cur = 'B'; break;
                case 12: char_cur = 'C'; break;
                case 13: char_cur = 'D'; break;
                case 14: char_cur = 'E'; break;
                case 15: char_cur = 'F'; break;
            }
            
            value_hex[value_hex.length - 1 - iteration_cur] = char_cur;
            
            iteration_cur += 1;
            
        }while(value_base > 0);
        
        return value_hex;
    }
    
    public char[] toOctalString()
    {
        int value_base      = value;
        int value_remainder = 0;
        int value_quotient  = 0;
        
        
        char[] value_oct = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        
        
        int iteration_cur = 0;
        do
        {
            char char_cur = '0';
            
            
            value_remainder = value_base % 8;
            value_base /= 8;
            
            switch(value_remainder)
            {
                case 0: char_cur = '0'; break;
                case 1: char_cur = '1'; break;
                case 2: char_cur = '2'; break;
                case 3: char_cur = '3'; break;
                case 4: char_cur = '4'; break;
                case 5: char_cur = '5'; break;
                case 6: char_cur = '6'; break;
                case 7: char_cur = '7'; break;
            }
            
            value_oct[value_oct.length - 1 - iteration_cur] = char_cur;
            
            iteration_cur += 1;
            
        }while(value_base > 0);
        
        return value_oct;
    }
        
    
    
}
