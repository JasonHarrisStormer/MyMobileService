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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.data.LinesRepository;
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

    // @PutMapping("/pay/{balance},{phonenumber}")
    // public ResponseEntity<Double> pay(@PathVariable double balance, @PathVariable String phonenumber){
    //     LinesRepository repo;
    //     List<Lines> temp = repo.findByNumberLike(phonenumber); //find the account
	// 	Lines newBalance = temp.get(3); //find the remphonebal at index 3
	// 	String sBalance = newBalance.toString(); //parse to string
	// 	double dBalance = Double.parseDouble(sBalance); // parse to double
	// 	double finalBalance = dBalance - balance; // subtract the payment
	// 	temp.set(3, finalBalance);
    //     linesService.save();
    //     return new ResponseEntity<Double>(finalBalance, HttpStatus.OK);
    // }
}
