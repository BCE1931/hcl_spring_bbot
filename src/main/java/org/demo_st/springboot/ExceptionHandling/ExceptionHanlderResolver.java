package org.demo_st.springboot.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/exceptionhandlerresolver")
@RestController
public class ExceptionHanlderResolver {

    @GetMapping("/try")
    public ResponseEntity<?> tryexception(){
        System.out.println("try exception handler");
        throw new CustomException(HttpStatus.BAD_REQUEST, "user id missing");
    }

    @ExceptionHandler(CustomException.class)
    //in exception handler we can accept more than one exception inside {} and pass Exception ex as an argiment for
    //function
    //her ei t works in local or in this class only
    //but global level custom exception handler wirks for every controller class

    public ResponseEntity<?> handleCustomException(CustomException ex){
        ErrorMag errorMag = new ErrorMag(new Date(), ex.getMessage(),  ex.getStatus().value() );
        return new ResponseEntity<>(errorMag, ex.getStatus());
    }
}
