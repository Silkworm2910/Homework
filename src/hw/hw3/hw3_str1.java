package hw.hw3;

import java.util.Scanner;

public class hw3_str1 {
    public static void main(String[] args) {
        /*Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
*/
        String str, podStr, newPodStr;
        System.out.println("Введите строку");
        Scanner in1 = new Scanner(System.in);
        str = in1.nextLine();
        System.out.println("Введите подстроку для замены");
        Scanner in2 = new Scanner(System.in);
        podStr = in2.nextLine();
        System.out.println("Введите новую подстроку");
        Scanner in3 = new Scanner(System.in);
        newPodStr = in1.nextLine();
        str = str.replace(podStr, newPodStr);
        System.out.println(str);
}
}
