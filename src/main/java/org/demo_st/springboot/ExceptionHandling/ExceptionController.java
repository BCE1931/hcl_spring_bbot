package org.demo_st.springboot.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @GetMapping("/try")
    public ResponseEntity<?> exceptiontry(){
        try{
            //your busieness logic here
            throw new CustomException(HttpStatus.BAD_REQUEST , "bad request or user id missing");
        }
        catch (CustomException ce){
            ErrorMag errorMag = new ErrorMag(new Date() , ce.getMessage(),  ce.getStatus().value());
            //response entity compulsory
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMag);
        }
        catch (Exception ex){
            ErrorMag errorMag = new ErrorMag(new Date() , "bad request controlled by spring" , 500);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMag);
        }
    }
}
