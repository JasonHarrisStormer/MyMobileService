package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.User;
import com.mymobileservice.data.UserRepository;

@Service
public class UserServices {
    
   
    @Autowired
    UserRepository repo;
        
    public List<User> findAll() {
		List<User> accounts = repo.findAll();

		List<User> models = new LinkedList<>();
		for (User account : accounts) {
			User temp = account;
			
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User add(User account) {
		User dbAccount = repo.save(account);
		return dbAccount;
	}
	
	public User findByEmailLike(String email){
		User account;
		Optional<User> temp = repo.findByEmailLike(email);

		if(temp.isPresent()){
			account = temp.get();
		}else{
			account = new User();
		}
		return account;
	}
	

    public User findById(int id) {
        User account;
		Optional<User> temp = repo.findById(id);

		if(temp.isPresent()){
			account = temp.get();
    	}else{
			account = new User();
		}

		return account;
	}
}
