package cinema.exception;

public class ApiRequestExeption extends RuntimeException {
    public ApiRequestExeption(String message) {
        super(message);
    }
}
