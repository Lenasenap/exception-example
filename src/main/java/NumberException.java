public class NumberException extends Exception {
    int number;

    public NumberException(String message, int number) {
        super(message);
        this.number = number;
    }
}
