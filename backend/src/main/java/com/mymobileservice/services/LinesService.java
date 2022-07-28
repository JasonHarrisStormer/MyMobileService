package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.data.LinesRepository;



@Service
public class LinesService {
    @Autowired
	LinesRepository repo;
	
	public List<Lines> findAll() {
        List<Lines> lines = repo.findAll();

		List<Lines> models = new LinkedList<>();
		for (Lines line : lines) {
			Lines temp = line;
			
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Lines add(Lines lines) {
		Lines dbLines = repo.save(lines);
		return dbLines;
	}
	
	public List<Lines> findByAccount(int accountid) {
		
		List<Lines> temp = repo.findByAccountIdLike(accountid);	
	
		return temp;
	}
	
	public List<Lines> findByPhoneNumber(String number) {

		List<Lines> temp = repo.findByNumberLike(number);
		return temp;
		
	}

	public void upDatePlan(int newplan, String phonenumber){
		repo.updatePlan(newplan, phonenumber);
	}

    public void upDatePhone(double phoneid, String phonenumber) {
		repo.updatePhone(phoneid, phonenumber);
    }
    
}
