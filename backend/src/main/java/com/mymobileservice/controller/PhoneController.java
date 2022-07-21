package com.mymobileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.mymobileservice.data.AccountRepository;

public class PhoneController {
	@Autowired
    private AccountRepository accountRepo;

}
