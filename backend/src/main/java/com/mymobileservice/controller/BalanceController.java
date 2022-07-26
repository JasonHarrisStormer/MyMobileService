package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Balance;
import com.mymobileservice.services.BalanceService;

@RestController
@RequestMapping(path="/balance/v1")
@CrossOrigin("http://localhost:4200")
public class BalanceController {
    @Autowired
    BalanceService balanceService;
    
    @GetMapping("/account/{accountid}")
	public ResponseEntity<List<Balance>> findAccount(@PathVariable int accountid) {
		return new ResponseEntity<List<Balance>>(balanceService.findByAccount(accountid), HttpStatus.OK);
	}

    @PutMapping("/planswap/{accountid},{balance}")
    public void planSwap(@PathVariable int accountid, @PathVariable double balance){
         balanceService.updateBalance(accountid, balance);
     }
}
