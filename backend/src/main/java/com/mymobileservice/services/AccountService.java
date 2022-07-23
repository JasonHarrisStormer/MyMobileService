package com.mymobileservice.services;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Lines;
import com.mymobileservice.data.AccountRepository;
import com.mymobileservice.models.AccountModel;
import com.mymobileservice.models.LinesModel;

@Service
public class AccountService {
	@Autowired
	AccountRepository repo;
	
	public List<AccountModel> findAll() {
		List<Account> accounts = repo.findAll();

		List<AccountModel> models = new LinkedList<>();
		for (Account account : accounts) {
			AccountModel temp = new AccountModel(account);
			
			Set<LinesModel> temp2 = new HashSet<>();
			for (Lines lines : account.getLine()) {
				temp2.add(new LinesModel(lines));
			}
			temp.setLine(temp2);
			models.add(temp);
		}
		return models;
	}
	
	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	// public AccountModel add(AccountModel account) {
	// 	Account dbAccount = repo.save(new Account(account));
	// 	return new AccountModel(dbAccount);
	// }
	
	public AccountModel findByEmailLike(String email){
		AccountModel account;
		Optional<Account> temp = repo.findByEmailLike(email);

		if(temp.isPresent()){
			account = new AccountModel(temp.get());

			Set<LinesModel> tempL = new HashSet<>();
			for (Lines lines : temp.get().getLine()) {
				tempL.add(new LinesModel(lines));
			}

			account.setLine(tempL);
		}else{
			account = new AccountModel();
		}
		return account;
	}
	

    public AccountModel findById(int id) {
        AccountModel account;
		Optional<Account> temp = repo.findById(id);

		if(temp.isPresent()){
			account = new AccountModel(temp.get());

			Set<LinesModel> tempL = new HashSet<>();
			for (Lines lines : temp.get().getLine()) {
				tempL.add(new LinesModel(lines));
			}

			account.setLine(tempL);
    	}else{
			account = new AccountModel();
		}

		return account;
	}
}
