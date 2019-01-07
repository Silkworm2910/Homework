package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/
public class SortEvenNumbersFromFile {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String line;
        Integer buffer;
        ArrayList<Integer> list = new ArrayList<>();

        while ((line = fileReader.readLine()) != null) {
            buffer = Integer.parseInt(line);
            if (buffer % 2 == 0) {
                list.add(buffer);
            }
        }

        fileReader.close();

        Collections.sort(list);

        for (Integer s: list) {
            System.out.println(s);
        }

    }
}
