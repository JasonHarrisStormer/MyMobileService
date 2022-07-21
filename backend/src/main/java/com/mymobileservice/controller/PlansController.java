package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Plans;
import com.mymobileservice.services.PlansService;


@RestController
@RequestMapping("/plans/v1")
public class PlansController {
	
	@Autowired
	PlansService planService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Plans>> getPlans(){
		return new ResponseEntity<List<Plans>>(planService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Plans> save(@RequestBody Plans plans){
		return new ResponseEntity<Plans>(planService.save(plans), HttpStatus.CREATED);
	}
}
