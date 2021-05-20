package rentcar.backend.exception;

import org.springframework.http.HttpStatus;

public class ApiRequestException extends RuntimeException{

    protected final HttpStatus status;

    public ApiRequestException(String message) {
        super(message);
        status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
        status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ApiRequestException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public ApiRequestException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
