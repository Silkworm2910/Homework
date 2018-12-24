package hw.hw211118;

import java.io.*;

public class Task1 {
   /* Задача 1
    Скопировать файл (имена файлов задаются с клавиатуры).
    Программа должна выводить количество скопированных байт.*/

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            InputStream in = new FileInputStream(reader.readLine()); // file1.txt
            OutputStream out = new FileOutputStream(reader.readLine()); // file2.txt

            int count = 0;

            while (in.available() > 0) {
                out.write(in.read());
                count++;
            }

            System.out.println(count);

            in.close();
            out.close();
            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}




