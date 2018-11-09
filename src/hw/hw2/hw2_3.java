package hw.hw2;

public class hw2_3 {
    public static void main(String[] args) {
        /*Задача 3
        Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        */
        int j = 2;
        for (int i = 0; i < 20; i++) {
            System.out.print(j + " ");
            j*=2;
            }
        }
    }

