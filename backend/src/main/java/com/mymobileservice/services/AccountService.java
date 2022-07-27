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
    public Account makeBill(int id) {
		Account account;
		Optional<Account> temp = repo.findById(id);

		double phoneBal = 0; 
		double balance = 0;

		if(temp.isPresent()){
			account = temp.get();
			double curBalance = 0;
			double curPhoneBal = 0; 

			Set<Lines> tempL = new HashSet<>();
			for (Lines lines : temp.get().getLine()) {

				List<Lines> tempP = new ArrayList<>(tempL); //converting the set to a list
				Lines tPhonenumber = tempP.get(0); // grabbing the phone number from the list
				String tPhone = tPhonenumber.toString(); // converting this phone number to string
				int tPlan = lRepo.getPhonePlan(tPhone); // getting plan id for this line
				double tPlanPrice = plRepo.getPlanPrice(tPlan); // getting monthly plan price for this line
				double tPhoneBal = lRepo.getPhoneBal(tPhone); // getting remaining phone balance for this line
				int tPhoneId = lRepo.getPhoneId(tPhone); //getting phone id for this line
				double tPhonePrice = pRepo.getPrice(tPhoneId); //getting phone price from repo

				double monthTPhonePrice = tPhonePrice/36;

				double tBalance = curBalance + tPlanPrice + monthTPhonePrice; //doing sum maths
				curBalance = tBalance; //sending our results out of this for loop
				double tPBal = curPhoneBal + tPhoneBal; // doing sum moar maths
				curPhoneBal = tPBal; //sending these results out also
			}
			phoneBal = curBalance; //sending our results out of this if check
			balance = curBalance; //sending our results out here also

			account.setPhoneBal(phoneBal);// setting the balance for the phones on the account
			account.setBalance(balance); // setting our balance in the account
    	}else{
			account = new Account(); // or not lol
		}

      	Account newBal = repo.findMyId(id);  // returning the fruits of our labor
		return newBal;
    }

}
