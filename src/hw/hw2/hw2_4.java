package hw.hw2;
import java.util.Scanner;
public class hw2_4 {
    public static void main(String[] args) {
        /*
        Задача 4
Проверьте, является ли натуральное число — простым.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int chislo = in.nextInt();
        int count = 0;
        for (int i = 1; i < chislo +1; i++) {
            if (chislo%i == 0) {
                count++;
            }
            }
            if (count == 2) {
                System.out.println("Число является простым");
            }
                else{
                    System.out.println("Число не является простым");
                }
            }
            }
