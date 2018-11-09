package hw.hw3;

import java.util.Arrays;
import java.util.Scanner;
public class hw3_4 {
    public static void main(String[] args) {
     /* Задача 4
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
       */
        System.out.println("Введите чётное положительное число");
        int chislo;
        while (true) {
            Scanner in = new Scanner(System.in);
            chislo = in.nextInt();
            if ((chislo % 2 == 0) & (chislo > 0)) {
                in.close();
                break;
            } else {
                System.out.println("Некорректный ввод. Повторите попытку.");
                System.out.println("Введите чётное положительное число");
            }
        }

        int[] arr = new int[chislo];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 11) - 5);
        }
        System.out.println(Arrays.toString(arr));

        int polovina1 = 0;
        int polovina2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                polovina1 += Math.abs(arr[i]);
            } else {
                polovina2 += Math.abs(arr[i]);
            }
        }

        if (polovina1 > polovina2) {
            System.out.println("Сумма модулей первой половины массива больше");
        }
           else if (polovina1 < polovina2) {
            System.out.println("Сумма модулей второй половины массива больше");
            }
            else {
            System.out.println("Сумма модулей первой половины массива равна сумме модулей второй половины массива");
        }

    }
}

