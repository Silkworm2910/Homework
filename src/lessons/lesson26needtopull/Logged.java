package lessons.lesson26needtopull;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logged {
    // создание логгера
    private static final Logger LOGGER = Logger.getLogger(Logged.class.getName());

    static {
        LOGGER.setLevel(Level.ALL);
    }

    public static void main(String[] args) {
        //
        LOGGER.info("Started with args: " + Arrays.toString(args));
        try {
            int result = 3/0;
        } catch (Exception e) {
            LOGGER.severe("Fatal error: " + e.getMessage());
        }
    }
}

class LoggedFile {
    // создание логгера
    private static final Logger LOGGER = Logger.getLogger(Logged.class.getName());

    static {
        try {
            LOGGER.addHandler(new FileHandler("logged.log"));
        } catch (IOException e) {
            LOGGER.warning("Не удалось создать файл");
        }
    }
}