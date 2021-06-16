package exception;

public class DirectorNotFoundException extends RuntimeException {
    public DirectorNotFoundException(String message) {
        super(message);
    }
}