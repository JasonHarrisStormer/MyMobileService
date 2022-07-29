package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.services.LinesService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/lineinfo/v1")
@CrossOrigin("http://localhost:4200")
@Tag(name = "Line Controller")
public class LinesController {
    @Autowired
    LinesService linesService;

    @PostMapping("/add")
    //add a line to an existing account
    public ResponseEntity<Lines> save(@RequestBody Lines newLine){
        return new ResponseEntity<Lines>(linesService.add(newLine), HttpStatus.CREATED);
    }

    @GetMapping
    //get them all... disable in prod
    public ResponseEntity<List<Lines>> findAll(){ 
        List<Lines> models = linesService.findAll();
        return new ResponseEntity<List<Lines>>(models, HttpStatus.OK);
    }

    @GetMapping("/phonenumber/{number}")
    //get line info by phone number
    public ResponseEntity<List<Lines>> findPhone(@PathVariable String number){
        return new ResponseEntity<List<Lines>>(linesService.findByPhoneNumber(number), HttpStatus.OK);
    }

    @GetMapping("/account/{accountid}")
    //get line info by account number
	public ResponseEntity<List<Lines>> findAccount(@PathVariable int accountid) {
		return new ResponseEntity<List<Lines>>(linesService.findByAccount(accountid), HttpStatus.OK);
	}

    @PutMapping("/planswap/{newplan},{phonenumber}")
    //change the plan on the line
    public void planSwap(@PathVariable int newplan, @PathVariable String phonenumber){
         linesService.upDatePlan(newplan, phonenumber);
     }

     @PutMapping("/phoneswap/{phoneid},{phonenumber}")
     //change the phone on the line
    public void phoneSwap(@PathVariable double phoneid, @PathVariable String phonenumber){
         linesService.upDatePhone(phoneid, phonenumber);
     }

     @DeleteMapping("/remline/{phonenumber}")
     public void deleteLine(@PathVariable String phonenumber){
        linesService.deleteLine(phonenumber);
     }
}
