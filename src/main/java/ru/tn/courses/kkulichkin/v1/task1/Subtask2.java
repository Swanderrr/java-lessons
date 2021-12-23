/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task1;

/**
 *
 * @author Wander
 * Вариант 1
 * У прилавка магазина выстроилась очередь из n покупателей. 
 * Время обслуживания i-того покупателя равно tj (i = 1, …, n). 
 * Определить время Ci пребывания i-гo покупателя в очереди.
 */
public class Subtask2
{
    public static void main(String[] args)
    {
        int[] array_of_service_time = {20,16,24,12,100,3,0,8,60,120};
        find_the_waiting_in_line_time_for_i_buyer(array_of_service_time, 2);
    }
    
    public static int find_the_waiting_in_line_time_for_i_buyer(int[] array_of_service_time, int i)
    {
        int array_i = i - 1;
        int accumulated_waiting_time = 0;
        
        for(int k = 0; k < array_i; k++)
        {
            accumulated_waiting_time += array_of_service_time[k];
        }
        
        System.out.printf("Покупатель под номером %d простоит в очереди %d секунд", i,accumulated_waiting_time);
        return accumulated_waiting_time;
    }
    
    
}
