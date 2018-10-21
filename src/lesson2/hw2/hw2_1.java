package lesson2.hw2;

public class hw2_1 {

    public static void main(String[] args) {
       /*Задача 1
        В три переменные a, b и c явно записаны программистом три целых
        попарно неравных между собой числа.
        Создать программу, которая переставит числа в переменных таким образом,
        чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
        */
        int a = -99;
        int b = 28;
        int c = -144;
        int a1, b1, c1;
        if (a < b)
            if (c < a) {b1 = a; a1 = c; c1 = b;}
            else if (c < b) {a1 = a; b1 = c; c1 = b;}
            else {a1 = a; b1 = b; c1 = c;}
        else if (c < b) {a1 = c; b1 = b; c1 = a;}
            else if (c < a) {a1 = b; b1 = c; c1 = a;}
            else {a1 = b; b1 = a; c1 = c;}
            a = a1; b = b1; c = c1;
        System.out.println(a + " " + b + " " + c + " ");
    }
}