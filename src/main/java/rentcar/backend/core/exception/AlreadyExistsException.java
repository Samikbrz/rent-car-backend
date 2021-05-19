package rentcar.backend.core.exception;

import org.springframework.http.HttpStatus;

public class AlreadyExistsException extends ApiRequestException{

    public AlreadyExistsException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }

    public AlreadyExistsException(String message, Throwable cause) {
        super(message, cause,HttpStatus.BAD_REQUEST);
    }
}
