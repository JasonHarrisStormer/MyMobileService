package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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
	
	public Lines find(String phonenumber) {
		return repo.findById(phonenumber).get();
	}
	
	public Optional<Lines> findByCriteria(String phonenumber) {
		return repo.findById(phonenumber);
	}

    public Optional<Lines> findByAccountNumber(int id) {
        return repo.findById(accountid);
    }
}
