package hw.hw051218.strategy;

import java.util.Date;

public class TimeFileLogger extends FileLogger {
    @Override
    public void write(String mess) {
        Date date = new Date();
        super.write(mess + " " + date.toString() );
    }
}
