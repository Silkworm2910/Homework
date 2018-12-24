package lessons.patterns.command;

public class ProcessComand extends Command {

    public ProcessComand(TextProcessor processor) {
        super(processor);
    }

    @Override
    String name() {
        return "ProcessCommand";
    }

    @Override
    boolean execute() {
        System.out.println("реализация ProcessCommand");
        return true;
    }
}
