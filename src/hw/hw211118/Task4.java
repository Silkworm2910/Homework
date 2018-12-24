package hw.hw211118;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
   /* Задание 4
    Ввести с консоли имя файла.
    Считать все байты из файла.
    Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.*/

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> treeSet = new TreeSet<>();

        try {
            InputStream in = new FileInputStream(reader.readLine());
            while (in.available() > 0) {
                treeSet.add(in.read());
            }

            for (int s: treeSet) {
                System.out.println(s);
            }

            in.close();
            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
