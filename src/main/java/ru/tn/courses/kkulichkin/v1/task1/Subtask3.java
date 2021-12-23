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
 * Даны две последовательности a1 ≤ a2 ≤ ... ≤ аn и b1 ≤ b2 ≤ ... ≤ bn. 
 * Образовать из них новую последовательность чисел так, 
 * чтобы она тоже была неубывающей (дополнительный массив не использовать).
 */
public class Subtask3
{
    public static void main(String[] arg)
    {
        float[] sequence_a = {-1,4,50,700};
        float[] sequence_b = {-90,-37,0,3,10,23,60,500,790,9000};
        
        
        System.out.println("Две последовательности до образования из них новой:");
        print_a_sequence_out(sequence_a);
        System.out.println("");
        print_a_sequence_out(sequence_b);
        System.out.println("");
        
        
        
        float[] merged_sequence_ab = merge_two_sequences_together(sequence_a, sequence_b);
        bubble_sort_the_sequence(merged_sequence_ab);
        
        System.out.println("Полученная последовательность:");
        print_a_sequence_out(merged_sequence_ab);
        

    }
    
    
    public static float[] merge_two_sequences_together(float[] a, float[] b)
    {
        int combined_sequence_length = a.length + b.length;
        float[] mergerd_sequence = new float[combined_sequence_length];
        
        for(int i = 0; i < a.length; i++) mergerd_sequence[i] = a[i];
        for(int i = 0; i < b.length; i++) mergerd_sequence[a.length + i] = b[i];
        
        return mergerd_sequence;
    }
    
    public static void bubble_sort_the_sequence(float[] sequence)
    {
        for(int i = 0; i < sequence.length - 1; i++)
        {
            for(int j = 0; j < sequence.length - 1 - i; j++)
            {
                if(sequence[j] > sequence[j + 1])
                {
                    float temporary_value_storage = sequence[j + 1];
                    sequence[j + 1] = sequence[j];
                    sequence[j]     = temporary_value_storage;
                }
            }  
        }
    }
    
    public static void print_a_sequence_out(float[] sequence)
    {
        for(int i = 0; i < sequence.length; i++)
        {
            System.out.printf("%f, ",sequence[i]);
        }
    }
    
    
    
    
}
