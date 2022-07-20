package com.mymobileservice.controller;

import com.mymobileservice.models.AccountModel;
import com.mymobileservice.data.AccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/account/create")
public class AccountController {
    @AutoWired
    private AccountRepo accountRepo;
    AccountModel accountModel = new AccountModel();
    
    @PostMapping(path="/create")
    public @ResponseBody String addNewAccount (@RequestParam String email, @RequestParam String firstname, @RequestParam String lastname, 
        @RequestParam String address, @RequestParam String address2, @RequestParam String city, @RequestParam String state, @RequestParam Integer zipcode){
            
            
            accountModel.setEmail(email);
            accountModel.setFirstname(firstname);
            accountModel.setLastname(lastname);
            accountModel.setAddress(address);
            accountModel.setAddress2(address2);
            accountModel.setCity(city);
            accountModel.setState(state);
            accountModel.setZipcode(zipcode);
            accountRepo.save(accountModel);
            return "redirect:/account";

        };

    @GetMapping(name = "/account")
    @Secured("has_Role('email')")
    public @ResponseBody List<AccountModel> getAccounts() {
        return accountRepo.findAll(); 
    
    }
}
