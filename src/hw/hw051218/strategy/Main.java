package hw.hw051218.strategy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.write("log for console");
        consoleLogger.write("log2 for console");

        FileLogger fileLogger = new FileLogger();
        fileLogger.write("log for file");
        fileLogger.write("log2 for file");

        TimeFileLogger timeFileLogger = new TimeFileLogger();
        timeFileLogger.write("log for file + date");
        Thread.sleep(10_000);
        timeFileLogger.write("log2 for file + date");
    }
}
