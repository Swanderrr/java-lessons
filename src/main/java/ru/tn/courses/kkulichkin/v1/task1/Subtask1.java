/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tn.courses.kkulichkin.v1.task1;

/**
 *
 * @author kkulichkin
 * Вариант 1
 * Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 */
public class Subtask1
{
    
    public static void main(String[] args)
    {
         int[] array_of_natural_numbers = {1,2,3,4,5,6,7,8,9,10};
         find_a_sum_of_array_of_natural_elements_divisible_by_k(array_of_natural_numbers, 2);
    }
    
    public static int find_a_sum_of_array_of_natural_elements_divisible_by_k(int[] array_of_natural_elements, int k)
    {
        System.out.print("Числа ");
        
        
        int sum_of_array_of_natural_elements = 0;
        for(int i = 0; i < array_of_natural_elements.length; i++ )
        {
            int current_array_element = array_of_natural_elements[i];
            if(current_array_element % k == 0)
            {
                sum_of_array_of_natural_elements += current_array_element;
                System.out.printf("%d, ", current_array_element);
            }
        }
        
        System.out.printf("- кратны %d, и их сумма равна %d ", k, sum_of_array_of_natural_elements);
        
        return sum_of_array_of_natural_elements;
    }
    
    
    
    
    
    
    
}
