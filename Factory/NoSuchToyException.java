package Factory;

public class NoSuchToyException extends Exception {
    public NoSuchToyException(String errorMessage) {
        super(errorMessage);
    }
}
