package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Phone;
import com.mymobileservice.services.PhoneService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/phones/v1")
@CrossOrigin("http://localhost:4200")
@Tag(name = "Phone Controller")
public class PhoneController {
	
	@Autowired
	PhoneService phoneService;
	
	@GetMapping
	//get all... disable in prod
	public ResponseEntity<List<Phone>> findAll(){
		List<Phone> models = phoneService.findAll();

		return new ResponseEntity<List<Phone>>(models, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	//add a phone to the db
	public ResponseEntity<Phone> save(@RequestBody Phone newPhone){
		return new ResponseEntity<Phone>(phoneService.add(newPhone), HttpStatus.CREATED);
	}

	@GetMapping("/phone/{model}")
	//get phone info by model name
	public List<Phone> findByName(@PathVariable String model){
		return phoneService.findByPhoneModel(model);
	}

	@GetMapping("/priceabove/{price}")
	//get phone info by price > input
	public List<Phone> findByPriceGreater(@PathVariable double price){
		return phoneService.findByPriceGreater(price);
	}

	@GetMapping("/pricebelow/{price}")
	//get phone info by price < input
	public List<Phone> findByPriceLess(@PathVariable double price){
		return phoneService.findByPriceLower(price);
	}

	@GetMapping("/id/{id}")
	//get phone info by phone id
	public ResponseEntity<Phone> findById(@PathVariable double id) {

		return new ResponseEntity<Phone>(phoneService.findById(id), HttpStatus.OK);
	}
}
