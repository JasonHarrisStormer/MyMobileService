package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.services.LinesService;

@RestController
@RequestMapping("/lineinfo/v1")
@CrossOrigin("http://localhost:4200")
public class LinesController {
    @Autowired
    LinesService linesService;

    @PostMapping("/add")
    public ResponseEntity<Lines> save(@RequestBody Lines newLine){
        return new ResponseEntity<Lines>(linesService.add(newLine), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Lines>> findAll(){ 
        List<Lines> models = linesService.findAll();
        return new ResponseEntity<List<Lines>>(models, HttpStatus.OK);
    }

    @GetMapping("/phonenumber/{number}")
    public ResponseEntity<List<Lines>> findPhone(@PathVariable String number){
        return new ResponseEntity<List<Lines>>(linesService.findByPhoneNumber(number), HttpStatus.OK);
    }

    @GetMapping("/account/{accountid}")
	public ResponseEntity<List<Lines>> findAccount(@PathVariable int accountid) {
		return new ResponseEntity<List<Lines>>(linesService.findByAccount(accountid), HttpStatus.OK);
	}

    @PutMapping("/planswap/{newplan},{phonenumber}")
    public void planSwap(@PathVariable int newplan, @PathVariable String phonenumber){
         linesService.upDatePlan(newplan, phonenumber);
     }
}
