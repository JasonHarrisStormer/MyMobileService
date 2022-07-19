package com.mymobileservice.controller;

import com.mymobileservice.model.Account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AccountController {

    private final IAccount account;

    public MyController(IAccount account) {
        this.account = account;
    }

    @GetMapping("/account")
    public String findAcount(Model model) {

        var account = (List<Account>) account.findById();

        return "showAccount";
    }
}
