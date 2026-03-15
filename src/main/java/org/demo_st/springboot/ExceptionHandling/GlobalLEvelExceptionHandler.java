package org.demo_st.springboot.ExceptionHandling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalLEvelExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleCustomException(CustomException ex){
        ErrorMag errorMag = new ErrorMag(new Date(), ex.getMessage(),  ex.getStatus().value() );
        return new ResponseEntity<>(errorMag, ex.getStatus());
    }
}
