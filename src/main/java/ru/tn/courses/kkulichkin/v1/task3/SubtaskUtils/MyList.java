/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task3.SubtaskUtils;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 *
 * @author kkulichkin
 */
public class MyList<T>
{
    T[] container;
    int length;
    
    MyListElement<T> root;
    
    
    public class MyListElement<T>
    {
        T value;
        
        MyListElement<T> next = null;
        MyListElement<T> prev = null;

        public MyListElement(T value_new){value = value_new;}
           
    }
    
    
    public MyList()
    {
        length = 0;
        root = null;
    }
    
    public MyList(T ... elements)
    {
        for( T element : elements)
        {
            add(element);
        } 
    }
    
    public boolean equals(MyList<T> list)
    {
        if(!(list.length == length)) return false;
        
        for(int i = 0; i < length; i++)
        {
            T my_element  = findById(i);
            T his_element = list.findById(i);
            
            if(!(my_element.equals(his_element))) return false;
        }
        return true;
    }
    
    
   
    public T[] getArray()
    {
        Class<T> type = (Class<T>) root.value.getClass();
        MyListElement<T> element_cur = root;
  
        T[] array = (T[]) Array.newInstance(type, length);

        int id_cur = 0;
        while(element_cur.next != null)
        {
            array[id_cur]    = element_cur.value;
            element_cur = element_cur.next;
            id_cur += 1;
        }
        
        array[length - 1] = element_cur.value;
        return  array;
    }
    
    
    public MyList<T> getSubMyList(int from, int to)
    {
        MyList<T> sub_list = new MyList<T>();
        
        
        MyListElement<T> element_cur = root;
        
        int id_cur = 0;
        
        while(element_cur.next != null)
        {
            if(id_cur >= from && id_cur <= to)
            {
                sub_list.add(element_cur.value);
            }
            
            element_cur = element_cur.next;
            id_cur += 1;   
        }
        
        
        if(id_cur >= from && id_cur <= to)
        {
            sub_list.add(element_cur.value);
        }
        
        
        return  sub_list;
    }
    
    
    
    public int find(T value)
    {
        int id_cur = 0;
        
        MyListElement<T> element_cur = root;
        
        while(element_cur.value.equals(value) != true)
        {
            element_cur = element_cur.next;
            id_cur += 1;
        }
        
        return id_cur;
        
    }
    
    private MyListElement<T> findBy(int id)
    {
        int id_cur = 0;
        
        MyListElement<T> element_cur = root;
        
        while(id_cur != id)
        {
            element_cur = element_cur.next;
            id_cur += 1;
        }
        
        return element_cur;
    }
    
    
    public T findById(int id)
    {
        return findBy(id).value;
    }
    
    
    public <K extends Collection<T>> void addCollection(K collection)
    {
        for(T value : collection)
        {
            add(value);
        }
    }
    
    public void add(T element)
    {
        if(root == null)
        {
            root = new MyListElement<T>(element);
        }
        else
        {
            MyListElement<T> element_new  = new MyListElement<T>(element);
            MyListElement<T> element_last = findBy(length - 1);
            element_last.next = element_new;
            element_new.prev  = element_last;
        }
        
        length += 1;
    }
    
    public void addAt(T element, int id)
    {
        if(id == 0)
        {
            MyListElement<T> element_new  = new MyListElement<T>(element);
            MyListElement<T> element_first = root;
            
            root = element_new;
            element_first.prev = element_new;
            element_new.next   = element_first;
            element_new.prev   = null;
            
        }
        else if (id == length - 1)
        {
            MyListElement<T> element_new  = new MyListElement<T>(element);
            MyListElement<T> element_last = findBy(length - 1);
            element_last.next = element_new;
            element_new.prev  = element_last;
            element_new.next  = null;
        }
        else
        {
            MyListElement<T> element_new  = new MyListElement<T>(element);
            
            MyListElement<T> element_prev = findBy(id);
            MyListElement<T> element_next = element_prev.next;
            
            element_prev.next = element_new;
            element_new.prev  = element_prev;
            
            element_next.prev = element_new;
            element_new.next  = element_next;   
        }
        
        length += 1;
        
    }
    
    public void remove(T value)
    {
        removeAt(find(value));
    }
    
    public void removeAt(int id)
    {
        int id_cur = id;
        MyListElement<T> element_cur = findBy(id_cur);
        
        if(id_cur == 0)
        {
            MyListElement<T> element_next = element_cur.next;
            root = element_next;
            root.prev = null;
        }
        if(id_cur == length - 1)
        {
            MyListElement<T> element_prev = element_cur.prev;
            element_prev.next = null;
            
        }
        else
        {
            MyListElement<T> element_prev = element_cur.prev;
            MyListElement<T> element_next = element_cur.next;
        
        
            element_prev.next = element_next;
            element_next.prev = element_prev;  
        } 
        
        length -= 1;
        
    }
    
    
    public String toString()
    {
        String result = "";
        
        MyListElement<T> element_cur = root;
        if(root == null) return "";

        int id_cur = 0;
        
        while(element_cur.next != null)
        {
            result += id_cur + " : " + element_cur.value.toString() + "\n";
            element_cur = element_cur.next;
            id_cur += 1;   
        }
        
        result += id_cur + " : " + element_cur.value.toString() + "\n";
        
        return result;
    }
    
    
    
    
}
