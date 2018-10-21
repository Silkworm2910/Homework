package lesson2.hw2;

public class hw2_5 {
    public static void main(String[] args) {
        /*
        Задача 5
    Выведите на экран первые 11 членов последовательности Фибоначчи.
    Первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
         */
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        for (int j=0; j < 9; j++) {
            int aJ = a1 + a2;
            System.out.print(aJ + " ");
            a1 = a2;
            a2 = aJ;

        }

    }
}
