package be.intecbrussel.graphics;

public class NegativeSizeException extends IllegalArgumentException{
    public NegativeSizeException() {
    }

    public NegativeSizeException(String s) {
        super(s);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }
}
