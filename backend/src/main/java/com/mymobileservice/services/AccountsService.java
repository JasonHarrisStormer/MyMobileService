package com.mymobileservice.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mymobileservice.beans.Account;
import com.mymobileservice.data.AccountRepository;

@Service
public class AccountsService {

    private final AccountRepository repo;

    public AccountsService(AccountRepository repo) {
        this.repo = repo;
    }

	public Optional<Account> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

    
}
