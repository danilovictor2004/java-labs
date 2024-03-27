package exceptions;

public class NegocioExceptions extends RuntimeException{

    public NegocioExceptions(String message) {
        super(message);
    }

    public NegocioExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NegocioExceptions(Throwable cause) {
        super(cause);
    }
}
