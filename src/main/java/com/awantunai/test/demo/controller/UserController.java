package com.awantunai.test.demo.controller;

import com.awantunai.test.demo.dto.UserDto;
import com.awantunai.test.demo.dto.UserSessionDto;
import com.awantunai.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> userSignup(@RequestBody UserDto user){
        return new ResponseEntity<>(userService.userSignup(user), HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<UserSessionDto> login(@RequestParam String emailId, @RequestParam String password){
        return new ResponseEntity<>(userService.userLogin(emailId, password), HttpStatus.OK);
    }
}
