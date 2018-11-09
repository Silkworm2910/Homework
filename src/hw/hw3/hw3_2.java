package hw.hw3;

import java.util.Arrays;

public class hw3_2 {
    public static void main(String[] args) {
      /*  int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        arr[0] = 1;
        for (int j = 1; j < count; j++) {
            arr[j] = arr[j - 1] + 2;
        }
        System.out.println(Arrays.toString(arr));

        for (int j = count - 1; j > -1; j--) {
            System.out.print(arr[j] + " ");
        } */


        int[] arrOdd = new int[100/2];


        for (int i = 0; i < arrOdd.length; i++){
            arrOdd[i] = 1 + 2 * i;
        }

        System.out.println(Arrays.toString(arrOdd));

        for (int i = 0; i < arrOdd.length / 2; i++){

            int tmp = arrOdd[i];
            arrOdd[i] = arrOdd[arrOdd.length - i - 1];
            arrOdd[arrOdd.length -1- i] = tmp;
        }

        System.out.println(Arrays.toString(arrOdd));
    }
    }

