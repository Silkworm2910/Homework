package hw.hw051218.strategy;

import java.io.*;

public class FileLogger implements ILogger{
    @Override
    public void write(String mess) {
        OutputStream out = null;
        try {
            out = new FileOutputStream("logs for strategy pattern task", true) ;
            byte[] buffer = (mess + "\n").getBytes();
            out.write(buffer, 0, buffer.length);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}
