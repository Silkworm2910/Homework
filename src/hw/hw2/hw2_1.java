package hw.hw2;

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

        /*       int[] numbs;

        int t, j, size, counter =0;

        numbs = new int[3];

        numbs[0] = 15;
        numbs[1] = 45;
        numbs[2] = -2;
        size = numbs.length;

        //Пузырьковая сортировка
        for (int i = 1; i<size; i++){

            for(j = size - 1; j>=i; j--){
                if (numbs[j-1] > numbs[j]){
                    t = numbs[j - 1];
                    numbs[j - 1] = numbs[j];
                    numbs[j] = t;
                }
            }
        }
        //Сортировка методом вставки Insertsort
//        for (int animals = 1; animals<size; animals++){
//            for(int j1 = animals; j1>0 && numbs[j1 - 1]>numbs[j1]; j1--){
//                counter++;
//                int tmp = numbs[j1 - 1];
//                numbs[j1 - 1] = numbs[j1];
//                numbs[j1] = tmp;
//            }
//        }
        for (int u = 0; u<size; u++){
            System.out.print(numbs[u] + " ");
        }
        System.out.println("Отсортированный массив");*/
    }
}