package com.mymobileservice.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Phone;
import com.mymobileservice.data.PhoneRepository;

@Service
public class PhoneService {
	@Autowired
	PhoneRepository repo;
	
	public List<Phone> findAll() {
		List<Phone> phones = repo.findAll();

		List<Phone> models = new LinkedList<>();
		for (Phone phone : phones) {
			Phone temp = phone;
			
			models.add(temp);
		}
		return models;
	}

	public Phone findById(int id) {
        Phone phone;
		Optional<Phone> temp = repo.findById(id);

		if(temp.isPresent()){
			phone = temp.get();
    	}else{
			phone = new Phone();
		}
		return phone;
	}

	public List<Phone> findByPriceLower(double price){
		return repo.findByPriceLesserThan(price);
	}
	public List<Phone> findByPriceGreater(double price) {
		return repo.findByPriceGreaterThan(price);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Phone add(Phone phone) {
		Phone dbPhone = repo.save(phone);
		return dbPhone;
	}

    public List<Phone> findByPhoneModel(String model) {
        return repo.findByPhones(model);
    }
}
