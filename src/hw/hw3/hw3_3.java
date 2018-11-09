package hw.hw3;

import java.util.Arrays;
public class hw3_3 {
    public static void main(String[] args) {
     /* Задача 3
       Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
       Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
       */

     int[] arr = new int[15];
     int count = 0;
     for (int i = 0; i < arr.length; i++) {
         arr[i] = (int)(Math.random()*10);
         if (arr[i]%2 == 0) {
             count++;
         }
              }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество четных элементов в массиве: " + count);

    }
    }

