package com.mymobileservice.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Lines;
import com.mymobileservice.controller.AccountController;
import com.mymobileservice.data.AccountRepository;
import com.mymobileservice.data.LinesRepository;
import com.mymobileservice.data.PhoneRepository;
import com.mymobileservice.data.PlansRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository repo;
	@Autowired
	PhoneRepository pRepo;
	@Autowired
	LinesRepository lRepo;
	@Autowired
	PlansRepository plRepo;
	
	public List<Account> findAll() {
		List<Account> accounts = repo.findAll();

		List<Account> models = new LinkedList<>();
		for (Account account : accounts) {
			Account temp = account;
			
			Set<Lines> temp2 = new HashSet<>();
			for (Lines lines : account.getLine()) {
				temp2.add(lines);
			}
			temp.setLine(temp2);
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Account add(Account account) {
		Account dbAccount = repo.save(account);
		return dbAccount;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Account findByEmailLike(String email){
		Account account;
		Optional<Account> temp = repo.findByEmailLike(email);

		if(temp.isPresent()){
			account = temp.get();

			Set<Lines> tempL = new HashSet<>();
			for (Lines lines : temp.get().getLine()) {
				tempL.add(lines);
			}

			account.setLine(tempL);
		}else{
			account = new Account();
		}
		return account;
	}
	

    public Account findById(int id) {
        Account account;
		Optional<Account> temp = repo.findById(id);

		if(temp.isPresent()){
			account = temp.get();

			Set<Lines> tempL = new HashSet<>();
			for (Lines lines : temp.get().getLine()) {
				tempL.add(lines);
			}

			account.setLine(tempL);
    	}else{
			account = new Account();
		}

		return account;
	}
	

	@Transactional(propagation = Propagation.REQUIRED)
    public Account makeBill(int id, double balance, double phoneBal) {
		repo.makeBill(id, balance, phoneBal);
		Optional<Account> temp = repo.findById(id);
		Account account = temp.get();
		return account;
    }

}
