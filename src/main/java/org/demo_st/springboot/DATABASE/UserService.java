package org.demo_st.springboot.DATABASE;

import org.demo_st.springboot.DATABASE.One_to_many.UserMapping_onetomany;
import org.demo_st.springboot.DATABASE.One_to_many.UserMappping_one_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    @Autowired
    UserMappping_one_repo  userMappping_one_repo;

    public ResponseEntity<?> getuser(int id){
        return new  ResponseEntity<>(userRepo.findById(id).get(), HttpStatus.OK);
    }

    public ResponseEntity<?> adduser(User user){
        userRepo.save(user);
        return new ResponseEntity<>("user added successfully", HttpStatus.OK );
    }

    public ResponseEntity<?> saveUserone(UserMapping_onetomany user) {
        userMappping_one_repo.save(user);
        return ResponseEntity.status(HttpStatus.OK).body(userMappping_one_repo.getById(user.getId()));
    }
}
