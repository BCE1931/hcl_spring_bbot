package org.demo_st.springboot.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

//@Component -> we cant use component here because exceptions are not handled by spring we want
//to manually handle our own exceptions
public class CustomException extends RuntimeException {

    HttpStatus status;
    String message;

    CustomException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
