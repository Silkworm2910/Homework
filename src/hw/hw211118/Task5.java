package hw.hw211118;

import java.io.*;

public class Task5 {
   /* Задание 5
    С консоли считать имя файла.
    Посчитать в файле количество запятых. Вывести информацию в консоль.*/

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            InputStream in = new FileInputStream(reader.readLine());
            int count = 0;
            while (in.available() > 0) {
            if (in.read() == (byte)',') {
                count++;
            }
            }

            System.out.println(count);

            in.close();
            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
