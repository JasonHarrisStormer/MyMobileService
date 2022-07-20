package com.mymobileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymobileservice.beans.Account;
import com.mymobileservice.data.AccountRepository;

@Controller
@RequestMapping(path="/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepo;

    @PostMapping(path="/add")
    public @ResponseBody String addNewAccount(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String address, @RequestParam String address2, 
            @RequestParam String city, @RequestParam String state, @RequestParam Integer zipcode, @RequestParam String email){
                
                Account newAccount = new Account();
                newAccount.setFirstname(firstname);
                newAccount.setLastname(lastname);
                newAccount.setAddress(address);
                newAccount.setAddress2(address2);
                newAccount.setCity(city);
                newAccount.setState(state);
                newAccount.setZipcode(zipcode);
                newAccount.setEmail(email);
                accountRepo.save(newAccount);
                return "Created";

            }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Account> getAllAccounts() {
        return accountRepo.findAll();
    }
    
}
