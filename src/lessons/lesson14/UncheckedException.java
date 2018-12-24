package lessons.lesson14;

public class UncheckedException extends RuntimeException {
    public UncheckedException() {
        super();
    }

    public UncheckedException(String message) {
        super(message);
    }

    public UncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
