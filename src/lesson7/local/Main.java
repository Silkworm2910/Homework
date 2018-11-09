package lesson7.local;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int bound = 10;
        // Объявляем локальный класс и можем
        // работать с ним в рамках метода
        class Counter {
            private int i;
            private Random rnd = new Random();
            private int getAndCount() {
                return i += rnd.nextInt(bound);
            }
        }
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        int res1 = 0, res2 = 0;
        for (int i = 0; i < 10; i++) {
            res1 = counter1.getAndCount();
            res2 = counter2.getAndCount();
        }
        System.out.println("counter1 = " + res1);
        System.out.println("counter2 = " + res2);
    }
}
