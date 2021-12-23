/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task3;

import java.util.ArrayList;
import ru.tn.courses.kkulichkin.v1.task3.SubtaskUtils.MyInteger;

/**
 *
 * @author kkulichkin
 * Вариант 1
 * Разработать класс Integer
 * - класс должен содержать конструкторы Integer(), Integer(int x), Integer(String s)
 * - Реализовать метод сравнения двух объектов класса Integer
 * - Реализовать методы добавления значения add(Integer i), вычитания, умножения и деления
 * - Реализовать метод возведения в степень pow(int exponent)
 * - реализовать методы преставления числа в восьмеричной и шестнадцатеричной СС
 */
public class Subtask1
{
    public static void main(String[] arg)
    {
        char[] char_int = {'-','2','8','3','0','0','1'};
        
        MyInteger integer  = new MyInteger(char_int);
        MyInteger integer2 = new MyInteger(-283001);
        MyInteger integer3 = new MyInteger();
        
        System.out.println(integer.intValue());
        System.out.println(integer2.intValue());
        System.out.println(integer3.intValue());
        
        
        
        
        System.out.println(integer.equals(integer2));
        System.out.println(integer.equals(integer3));
        
        
        
        MyInteger integer30 = new MyInteger(10);
        MyInteger integer23 = new MyInteger(13);
      
        integer30.addInt(integer23);
        System.out.println(integer30.intValue());
        
        integer30.setValue(10);
        integer30.subInt(integer23);
        System.out.println(integer30.intValue());
        
        integer30.setValue(10);
        integer30.mulInt(integer23);
        System.out.println(integer30.intValue());
      
        integer30.setValue(169 *  5);
        integer30.divInt(integer23);
        System.out.println(integer30.intValue());
        
        
        
        
        MyInteger integer70 = new MyInteger(2);
        integer70.pow(10);
        System.out.println(integer70.intValue());
        
        
        
        
        
        
        MyInteger integer450 = new MyInteger(255);
        
        System.out.println(integer450.toHexString());
        System.out.println(integer450.toOctalString());
        
    }
}
