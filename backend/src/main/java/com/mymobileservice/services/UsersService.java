package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Users;
import com.mymobileservice.data.UsersRepository;

@Service
public class UsersService {
    
   
    @Autowired
    UsersRepository repo;
        
    public List<Users> findAll() {
		List<Users> userss = repo.findAll();

		List<Users> models = new LinkedList<>();
		for (Users users : userss) {
			Users temp = users;
			
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Users add(Users users) {
		Users dbUsers = repo.save(users);
		return dbUsers;
	}
	
	public Users findByEmailLike(String email){
		Users users;
		Optional<Users> temp = repo.findByEmailLike(email);

		if(temp.isPresent()){
			users = temp.get();
		}else{
			users = new Users();
		}
		return users;
	}
	

    public Users findById(int id) {
        Users account;
		Optional<Users> temp = repo.findById(id);

		if(temp.isPresent()){
			account = temp.get();
    	}else{
			account = new Users();
		}

		return account;
	}
}
