package org.demo_st.springboot.Responseentity;

import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/statuscode300")
public class StatusCode300 {

    @GetMapping("/api")
    public ResponseEntity<?> api() {
        System.out.println("try");
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
                .location(URI.create("/statuscode300/newapi"))
                .build();
    }

    @GetMapping("/newapi")
    public ResponseEntity<?> newapi() {
        System.out.println("try_new api");
        return ResponseEntity.ok("newapi");
    }
}