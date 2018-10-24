package lesson3.hw3;

import java.util.Arrays;

public class hw3_2 {
    public static void main(String[] args) {
        int count = 0;
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
        }
    }
    }

