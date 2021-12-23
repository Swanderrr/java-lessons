/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import ru.tn.courses.kkulichkin.v1.task3.SubtaskUtils.MyList;

/**
 *
 * @author kkulichkin
 * Разработать класс ListContainer<T> для хранения дженерик списков
 * -класс должен содержать конструктор по умолчанию и конструктор с new ListContainer<T>(T ... elements)
 * - метод получения значения списка
 * - метод сравнения двух контейнеров
 * - методы добавления и удаления элемента в контейнер
 * - методы поиска элементов по индексу или значению
 * - добавление коллекции элементов
 * - получение контейнера с подсписком по индексам
 */
public class Subtask2
{
    public static void main(String[] arg)
    {
        MyList<Integer> list  = new MyList<Integer>();
        MyList<Integer> list2 = new MyList<Integer>(1,2,3,4,5);
        
        System.out.println(list.toString());
        System.out.println(list2.toString());
        
        System.out.println(list2.equals(list));
        System.out.println(list2.equals(list2));
        
        list.add(3);
        list.add(9);
        
        System.out.println(list.toString());
        
        list.addAt(6, 1);
        
        System.out.println(list.toString());
        
        
        System.out.println(list.find(6));
        System.out.println(list.findById(1));
        
        list.removeAt(1);
        
        System.out.println(list.toString());
        
        ArrayList<Integer> collection = new ArrayList<>(Arrays.asList(10,20,30));
        list.addCollection(collection);
        
        System.out.println(list.toString());
        
        
        MyList<Integer> sub_list = list.getSubMyList(2, 4);
        
        System.out.println(sub_list.toString());
        
        
        
        
        Integer[] list_values = list2.getArray();
        
        System.out.println(Arrays.toString(list_values));
    }
    
    
    
    
    
    
    
    
    
    
}
