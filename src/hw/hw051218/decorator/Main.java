package hw.hw051218.decorator;

import hw.hw051218.decorator.CryptoInputStream;
import hw.hw051218.decorator.CryptoOutputStream;

import java.io.*;

public class Main {

    //вместо массива байтов в качестве пароля используется строка, не учла условие, переделывать не стала

    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

            try {
                in = new CryptoInputStream(new FileInputStream("file1.txt"), "landfill415");
                out = new CryptoOutputStream(new FileOutputStream("file2.txt"), "landfill415");

                byte[] buf = new byte[in.available()];
                while ((in.read(buf)) > 0) {
                    out.write(buf);
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        try {
            in = new CryptoInputStream(new FileInputStream("file2.txt"), "landfill415");
            out = new CryptoOutputStream(new FileOutputStream("file3.txt"), "landfill415");

            byte[] buf = new byte[in.available()];
            while ((in.read(buf)) > 0) {
                out.write(buf);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
