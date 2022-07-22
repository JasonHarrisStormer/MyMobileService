package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Phone;
import com.mymobileservice.services.PhoneService;

@RestController
@RequestMapping("/phones/v1")
@CrossOrigin("http://localhost:4200")
public class PhoneController {
	
	@Autowired
	PhoneService phoneService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Phone>> getPhones(){
		return new ResponseEntity<List<Phone>>(phoneService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Phone> save(@RequestBody Phone phone){
		return new ResponseEntity<Phone>(phoneService.save(phone), HttpStatus.CREATED);
	}
}
