package hw.hw051218.strategy;

public class ConsoleLogger implements ILogger{
    @Override
    public void write(String mess) {
        System.out.println(mess);
    }
}
