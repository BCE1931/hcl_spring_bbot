package org.demo_st.springboot.Interceptors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interceptor")
public class Controller {

    @GetMapping("/try")
    @CustomAnnotationinter(name = "customintercepptor") //used for second type
    public void tryinterceptor(){
//        throw new RuntimeException();
        System.out.println("try");
    }

}
