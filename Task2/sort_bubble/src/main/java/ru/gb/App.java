package ru.gb;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Arrays;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] array = {11, 2, 14, 3, 16, 8, 7, 10 };
        System.out.println(Arrays.toString(array));
        System.out.println();
        sort_bubble(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }    
        
    private static void sort_bubble(int[] array) {
        Logger logger = Logger.getLogger(App.class.getName ());
          
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                logger.log(Level.INFO, String.format("i = %d", i));
                logger.log(Level.INFO, String.format("need to swap? = %d", array[i] > array[i+1] ? 1 : 0));
                if (array[i] > array[i+1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    logger.log(Level.INFO, Arrays.toString(array));
                }
            }
        }

    }
    
}
