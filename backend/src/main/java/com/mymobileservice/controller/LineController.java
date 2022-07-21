package com.mymobileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.mymobileservice.data.AccountRepository;

public class LineController {
	@Autowired
    private AccountRepository accountRepo;

}
