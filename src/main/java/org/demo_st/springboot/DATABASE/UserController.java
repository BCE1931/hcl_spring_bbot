package org.demo_st.springboot.DATABASE;

import org.demo_st.springboot.DATABASE.One_to_many.UserMapping_onetomany;
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

    @PostMapping("/add_user_one")
    private ResponseEntity<?> saveUserOne(@RequestBody UserMapping_onetomany  user){
        return userService.saveUserone(user);
    }
}
