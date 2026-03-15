package org.demo_st.springboot.ExceptionHandling;

import java.util.Date;


public class ErrorMag {

    private Date date;

    private String message;

    private int status;

    ErrorMag(Date date, String message,int status) {
        this.date = date;
        this.message = message;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
