package lessons.lesson11;

import java.util.*;

public class task10 {
    public static void main(String[] args) {
       /* Задача 10
        Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
        Удалить из множества все числа больше 10.*/

        Set<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
             {
                set.add(in.nextInt());
            }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if(iterator.next()>10) {
                iterator.remove();
            }
        }

        System.out.println(set);
    }
}
