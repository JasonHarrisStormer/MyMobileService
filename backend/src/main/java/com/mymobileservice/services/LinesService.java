package com.mymobileservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.data.LinesRepository;

@Service
public class LinesService {
    @Autowired
	LinesRepository repo;
	
	public List<Lines> findAll() {
        return repo.findAll();
		
	}
	
	public Lines save(Lines line) {
		return repo.save(line);
	}
	
	public Lines find(String phonenumber) {
		return repo.findById(phonenumber).get();
	}
	
	public Optional<Lines> findByCriteria(String phonenumber) {
		//pagination through spring data jpa. indexing starts at 0
		return repo.findById(phonenumber);
	}
}
