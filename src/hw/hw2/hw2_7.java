package hw.hw2;

public class hw2_7 {
    public static void main(String[] args) {
        /*Задача 7
        Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
        симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
        int count = 0;
        int min;
        for (int hour = 0; hour < 24; hour++) {
            for (min = 0; min < 60; min++) {
                int pos1 = hour / 10;
                int pos2 = hour % 10;
                int pos3 = min / 10;
                int pos4 = min % 10;
                if (pos1 == pos4 && pos2 == pos3) {
                    ++count;
                }
            }
        }
        System.out.println("Количество симметиричных комбинаций: " + count);

        /*int n = 0;
        for (int hour = 0; hour < 24; hour++) {
            if ((hour % 10) > 5) {continue;}
            n++;
        }
        System.out.println("Симметричных комбинаций: " + n);*/
        }
        }

