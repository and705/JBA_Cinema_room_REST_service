package cinema.controller;

import cinema.exception.*;
import cinema.model.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ApiRequestExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ApiException handleApiRequestException(ApiRequestExeption e) {
        return new ApiException(e.getMessage());
    }

    @ExceptionHandler(ApiRequestExeptionPass.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public ApiException handleApiRequestExceptionPass(ApiRequestExeptionPass e) {
        return new ApiException(e.getMessage());
    }
}