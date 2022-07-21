package com.mymobileservice.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mymobileservice.beans.Plans;
import com.mymobileservice.data.PlansRepository;

@Service
public class PlansService {

    private final PlansRepository repo;

    public PlansService(PlansRepository repo) {
        this.repo = repo;
    }

	public Optional<Plans> findById(int id) {
		
		return repo.findById(id);
	}
    
}
