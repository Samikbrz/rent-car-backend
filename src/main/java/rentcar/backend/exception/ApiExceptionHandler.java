package rentcar.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import rentcar.backend.entity.ErrorResponse;

import java.io.IOException;

@ControllerAdvice
public class ApiExceptionHandler {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handleApiException(NotFoundException ex) {
        return new ErrorResponse("404", ex.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IOException.class)
    public ErrorResponse handleIOException(IOException ex) {
        return new ErrorResponse("400",  "Something went wrong while uploading!");
    }
}
