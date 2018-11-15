package lessons.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {

    /* Задача 4
        Ввести с клавиатуры 5 слов в список строк.
        Удалить 3 - ий элемент списка, и вывести оставшиеся элементы в обратном порядке.*/


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());

        for (String s:list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.remove(2);
        for (int i=list.size()-1; i>=0; i--)  {
            System.out.print(list.get(i) + " ");
        }
    }

}
