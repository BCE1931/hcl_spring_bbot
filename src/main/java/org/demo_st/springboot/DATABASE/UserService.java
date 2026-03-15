package org.demo_st.springboot.DATABASE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    public ResponseEntity<?> getuser(int id){
        return new  ResponseEntity<>(userRepo.findById(id).get(), HttpStatus.OK);
    }

    public ResponseEntity<?> adduser(User user){
        userRepo.save(user);
        return new ResponseEntity<>("user added successfully", HttpStatus.OK );
    }
}
