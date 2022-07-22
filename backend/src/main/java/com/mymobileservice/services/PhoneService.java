package com.mymobileservice.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.swing.text.AttributeSet.ColorAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Phone;
import com.mymobileservice.data.PhoneRepository;
import com.mymobileservice.models.PhoneModel;

@Service
public class PhoneService {
	@Autowired
	PhoneRepository repo;
	
	public List<PhoneModel> findAll() {
		List<Phone> phones = repo.findAll();

		List<PhoneModel> models = new LinkedList<>();
		for (Phone phone : phones) {
			PhoneModel temp = new PhoneModel(phone);
			
			models.add(temp);
		}
		return models;
	}

	// public PhoneModel findByName(String name) {
	// 	return repo.findByNameLike(name);
	// }

	// public List<Phone> findByPriceLower(double price){
	// 	return repo.findByPriceLesserThan(price);
	// }
	// public List<Phone> findByPriceGreater(double price) {
	// 	return repo.findByPriceGreaterThan(price);
	// }

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public PhoneModel add(PhoneModel phone) {
		Phone dbPhone = repo.save(new Phone(phone));
		return new PhoneModel(dbPhone);
	}

}
