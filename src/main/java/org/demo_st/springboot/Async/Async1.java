package org.demo_st.springboot.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class Async1 {

    @Async
    @GetMapping("/try")
    //the method which is annotated with async must be public because aop is involved
    //exception handling in thread
    public void tryMethod() {
        System.out.println("thread name is " + Thread.currentThread().getName());
        try{
            Thread.sleep(100000000);
        }
        catch (InterruptedException e) {}
    }
}
