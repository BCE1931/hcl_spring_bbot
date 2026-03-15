package org.demo_st.springboot.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class responsestatusexceptionResolver extends RuntimeException {

    HttpStatus status;

    responsestatusexceptionResolver(HttpStatus status , String msg) {
        super(msg);
        this.status = status;
    }
}
