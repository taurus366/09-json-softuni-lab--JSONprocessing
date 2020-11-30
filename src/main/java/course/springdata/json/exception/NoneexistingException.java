package course.springdata.json.exception;

public class NoneexistingException extends RuntimeException {

    public NoneexistingException() {
    }

    public NoneexistingException(String message) {
        super(message);
    }

    public NoneexistingException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoneexistingException(Throwable cause) {
        super(cause);
    }
}
