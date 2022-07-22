package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.services.AccountService;
import com.mymobileservice.beans.Account;


@RestController
@RequestMapping(path="/account/v1")
@CrossOrigin("http://localhost:4200")
public class AccountController {
   
    @Autowired
    AccountService accountService;

    @PostMapping(path="/add")
    public ResponseEntity<Account> save(@RequestBody Account account){

                return new ResponseEntity<Account>(accountService.save(account), HttpStatus.CREATED);

            }

    @GetMapping(path="/all")
    public ResponseEntity<List<Account>> findAll(){ 
        return new ResponseEntity<List<Account>>(accountService.findAll(), HttpStatus.OK);
    }
    
}
