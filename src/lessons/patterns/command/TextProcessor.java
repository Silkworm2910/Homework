package lessons.patterns.command;

import java.util.Scanner;

public class TextProcessor {
    private CommandsHistory history = new CommandsHistory();

    //private
    public void executeCommand(Command command) {
        if (command.execute())
            history.addCommand(command);
    }


public void start() {
    Scanner in = new Scanner(System.in);
    while (true) {
        switch (in.nextLine()) {
            case "process":
                executeCommand(new ProcessComand(this));
                break;

            case "exit":
                executeCommand(new ExitCommand(this));
                break;
        //if (in.nextLine().equals("process")) {
           // executeCommand(new ProcessCommand(this));
    }
}
}
}

