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

import com.mymobileservice.services.AccountService;
import com.mymobileservice.beans.Account;
import com.mymobileservice.models.AccountModel;


@RestController
@RequestMapping(path="/account/v1")
@CrossOrigin("http://localhost:4200")
public class AccountController {
   
    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountModel> save(@RequestBody AccountModel newAccount){
        return new ResponseEntity<AccountModel>(accountService.add(newAccount), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AccountModel>> findAll(){ 
        return new ResponseEntity<List<AccountModel>>(accountService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
	public ResponseEntity<AccountModel> findByEmail(@PathVariable String email) {
		return new ResponseEntity<AccountModel>(accountService.findByEmailLike(email), HttpStatus.OK);
	}

    @GetMapping("/id/{id}")
	public ResponseEntity<AccountModel> findById(@PathVariable int id) {
		return new ResponseEntity<AccountModel>(accountService.findById(id), HttpStatus.OK);
	}
    
}
