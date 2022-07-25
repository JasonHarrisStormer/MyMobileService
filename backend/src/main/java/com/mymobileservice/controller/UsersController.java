package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Users;
import com.mymobileservice.services.UsersService;

@RestController
@RequestMapping(path="/users/v1")
@CrossOrigin("http://localhost:4200")
public class UsersController {
    
    @Autowired
    UsersService userService;

    @PostMapping("/add")
    public ResponseEntity<Users> save(@RequestBody Users newUser){
        return new ResponseEntity<Users>(userService.add(newUser), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Users>> findAll(){ 
        return new ResponseEntity<List<Users>>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
	public ResponseEntity<Users> findByEmail(@PathVariable String email) {
		return new ResponseEntity<Users>(userService.findByEmailLike(email), HttpStatus.OK);
	}

}
