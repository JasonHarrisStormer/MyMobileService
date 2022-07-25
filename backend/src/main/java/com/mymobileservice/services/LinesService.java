package com.mymobileservice.services;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.data.LinesRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


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
	
	public List<Lines> findByPhoneNumber(String phonenumber) {

		List<Lines> temp = repo.findByNumberLike(phonenumber);
		return temp;
		
	}

    // public Lines findByAccountNumber(int accountid) {
	// 	Lines lines;
	// 	Optional<Lines> temp = repo.findByCriteria(accountid);
	
	// 	if(temp.isPresent()){
	// 		lines = temp.get();
	// 	}else{
	// 		lines = new Lines();
	// 	}
	
	// 	return lines;
	// }
    
}
