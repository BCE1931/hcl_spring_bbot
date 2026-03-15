package org.demo_st.springboot.DATABASE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpa")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add_user")
    private ResponseEntity<?> saveUser(@RequestBody User user){
        return userService.adduser(user);
    }

    @GetMapping("/get_user/{id}")
    private ResponseEntity<?> getUser(@PathVariable Integer id){
        return userService.getuser(id);
    }
}
