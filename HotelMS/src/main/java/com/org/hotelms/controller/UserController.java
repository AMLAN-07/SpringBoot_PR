package com.org.hotelms.controller;

import com.org.hotelms.entity.User;
import com.org.hotelms.service.serviceIMPL.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserServiceImpl usi;

    public UserController(UserServiceImpl usi) {
        this.usi = usi;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUserDetail() {
        List<User> allUser= (List<User>) usi.getAllUser();

//        return ResponseEntity.ok(allUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(allUser);
    }
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User u = usi.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(u);
    }

    @GetMapping("/oneUser/{id}")
    public ResponseEntity<User> getUserDetail(Long id) {
        usi.getOneUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(usi.getOneUser(id));
    }
}
