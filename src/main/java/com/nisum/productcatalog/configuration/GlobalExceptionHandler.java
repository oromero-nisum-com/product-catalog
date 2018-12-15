package com.nisum.productcatalog.configuration;

import com.nisum.productcatalog.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public
    ResponseEntity handleCustomException(Exception ex, WebRequest req) {
        String errorMessage = "Something went wrong";
        return handleExceptionInternal(ex, errorMessage, null, HttpStatus.BAD_REQUEST, req);
    }

}
