package com.mymobileservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mymobileservice.beans.Account;
import com.mymobileservice.data.AccountRepository;

public class AccountService {
	@Autowired
	AccountRepository repo;
	
	public List<Account> findAll() {
		return (List<Account>) repo.findAll();
	}
	
	public Account save(Account account) {
		return repo.save(account);
	}
	
	public Account find(int id) {
		return repo.findById(id).get();
	}
	
	public Optional<Account> findByCriteria(int id) {
		//pagination through spring data jpa. indexing starts at 0
		return repo.findById(id);
	}
}
