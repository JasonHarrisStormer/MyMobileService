package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Balance;
import com.mymobileservice.data.BalanceRepository;

@Service
public class BalanceService {
    @Autowired
    BalanceRepository repo;

    public List<Balance> findAll() {
        List<Balance> balances = repo.findAll();

		List<Balance> models = new LinkedList<>();
		for (Balance balance : balances) {
			Balance temp = balance;
			
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Balance add(Balance balance) {
		Balance dbLines = repo.save(balance);
		return dbLines;
	}
	
	public List<Balance> findByAccount(int accountid) {
		
		List<Balance> temp = repo.findByAccountIdLike(accountid);	
	
		return temp;
	}

	public void updateBalance(int accountid, double planCost, double phoneBal,double balance){
		repo.updateBalance(accountid, planCost, phoneBal, balance);
	}
}
