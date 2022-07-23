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
import com.mymobileservice.models.PhoneModel;
import com.mymobileservice.services.PhoneService;

@RestController
@RequestMapping("/phones/v1")
@CrossOrigin("http://localhost:4200")
public class PhoneController {
	
	@Autowired
	PhoneService phoneService;
	
	@GetMapping
	public ResponseEntity<List<PhoneModel>> findAll(){
		List<PhoneModel> models = phoneService.findAll();

		return new ResponseEntity<List<PhoneModel>>(models, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<PhoneModel> save(@RequestBody PhoneModel newPhone){
		return new ResponseEntity<PhoneModel>(phoneService.add(newPhone), HttpStatus.CREATED);
	}

	// @GetMapping("/phone/{name}")
	// public ResponseEntity<PhoneModel> findByName(@PathVariable String name){
	// 	return new ResponseEntity<PhoneModel>(phoneService.findByName(name), HttpStatus.CREATED);
	// }

	// @GetMapping("/priceabove/{price}")
	// public List<Phone> findByPriceGreater(@PathVariable double price){
	// 	return phoneService.findByPriceGreater(price);
	// }

	// @GetMapping("/pricebelow/{price}")
	// public List<Phone> findByPriceLess(@PathVariable double price){
	// 	return phoneService.findByPriceLower(price);
	// }
}
