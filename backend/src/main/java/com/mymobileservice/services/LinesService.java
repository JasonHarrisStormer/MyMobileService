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

import com.mymobileservice.beans.Lines;
import com.mymobileservice.beans.Plans;
import com.mymobileservice.data.LinesRepository;
import com.mymobileservice.models.LinesModel;
import com.mymobileservice.models.PlansModel;

@Service
public class LinesService {
    @Autowired
	LinesRepository repo;
	
	public List<LinesModel> findAll() {
        List<Lines> lines = repo.findAll();

		List<LinesModel> models = new LinkedList<>();
		for (Lines line : lines) {
			LinesModel temp = new LinesModel(line);
			models.add(temp);
		}
		return models;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public LinesModel add(LinesModel lines) {
		Lines dbLines = repo.save(new Lines(lines));
		return new LinesModel(dbLines);
	}
	
	public Lines find(String phonenumber) {
		return repo.findById(phonenumber).get();
	}
	
	public Optional<Lines> findByCriteria(String phonenumber) {
		//pagination through spring data jpa. indexing starts at 0
		return repo.findById(phonenumber);
	}

    public LinesModel findByAccountNumber(int id) {
        return null;
    }

    public LinesModel findByNumber(int id) {
        return null;
    }
}
