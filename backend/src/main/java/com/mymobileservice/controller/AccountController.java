package com.mymobileservice.controller;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymobileservice.BackendApplication;
import com.mymobileservice.beans.Account;
import com.mymobileservice.data.AccountRepository;
import com.mymobileservice.model.AccountModel;


@Controller
@RequestMapping(path="/account/v1")
public class AccountController {
	
	private static final Logger logger = Logger.getLogger(BackendApplication.class);
	
    @Autowired
    private AccountRepository accountRepo;

    @PostMapping(path="/addAccount")
    public @ResponseBody String createAccount(@RequestParam int id, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String address, @RequestParam String address2, 
            @RequestParam String city, @RequestParam String state, @RequestParam Integer zipcode, @RequestParam String email){
                logger.error("post called");
                AccountModel newAccount = new AccountModel();
                newAccount.setId(id);
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
    public @ResponseBody Iterable<AccountModel> getAllAccounts() {
    	logger.error("Get all called");
        return accountRepo.findAll();
    }
    
    @GetMapping(path="/find/{id}")
    public @ResponseBody Optional<AccountModel> getAccountByEmail(Integer id){ 
    	logger.error("Get 1 account called");
        return accountRepo.findById(id);
    }
}