package com.mymobileservice.controller;

import java.util.List;

//import org.jboss.logging.Logger;
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

import com.mymobileservice.services.AccountService;
//import com.mymobileservice.BackendApplication;
import com.mymobileservice.beans.Account;



@RestController
@RequestMapping(path="/account/v1")
@CrossOrigin("http://localhost:4200")
public class AccountController {
    //private static final Logger logger = Logger.getLogger(BackendApplication.class);

    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity<Account> save(@RequestBody Account newAccount){
        accountService.loginInfoAccounts(newAccount.getEmail(), newAccount.getPassword()); //updating username and password to user table
        return new ResponseEntity<Account>(accountService.add(newAccount), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Account>> findAll(){ 
        return new ResponseEntity<List<Account>>(accountService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
	public ResponseEntity<Account> findByEmail(@PathVariable String email) {
		return new ResponseEntity<Account>(accountService.findByEmailLike(email), HttpStatus.OK);
	}

    @GetMapping("/id/{id}")
	public ResponseEntity<Account> findById(@PathVariable int id) {
		return new ResponseEntity<Account>(accountService.findById(id), HttpStatus.OK);
	}
    
}
