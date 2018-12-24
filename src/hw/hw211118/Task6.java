package hw.hw211118;

import java.io.*;
import java.util.ArrayList;

public class Task6 {
  /*  Задача 6
    Считать с консоли три имени файла: file1, file2, file3.
    Разделить file1 по следующему критерию:
    Первую половину байт записать в file2, вторую половину байт записать в file3.
    Если в file1 количество байт нечетное, то file2 должен содержать большую часть.*/

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> bytes = new ArrayList<>();

        try {
            InputStream in1 = new FileInputStream(reader.readLine()); // file1.txt
            OutputStream out2 = new FileOutputStream(reader.readLine()); // file2.txt
            OutputStream out3 = new FileOutputStream(reader.readLine()); // file3.txt

            while (in1.available() > 0) {
                bytes.add(in1.read());
            }

            for (int i = 0; i < bytes.size()/2; i++) {
                out2.write(bytes.get(i));
            }

            for (int i = bytes.size()/2; i < bytes.size(); i++) {
                out3.write(bytes.get(i));
            }

           reader.close();
            in1.close();
            out2.close();
            out3.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
