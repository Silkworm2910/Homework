package hw.hw_synt.coords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Введите x-координату точки");
        while (true) {
            a = (int) in.nextDouble();
            if (a != 0) {
                break;
            } else {
                System.out.println("Повторите попытку");
            }
        }
        System.out.println("Введите y-координату точки");
        while (true) {
            b = (int) in.nextDouble();
            if (b != 0) {
                break;
            } else {
                System.out.println("Повторите попытку");
            }
        }
    QuarterDefinition.quart(a, b);
    }
}
