package cinema.model;

public class ApiException {
    private String error;

    public ApiException() {
    }
    public ApiException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
