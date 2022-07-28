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

import com.mymobileservice.beans.Plans;
import com.mymobileservice.services.PlansService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/plans/v1")
@CrossOrigin("http://localhost:4200")
@Tag(name = "Plans Controller")
public class PlansController {
	
	@Autowired
	PlansService planService;
	
	@GetMapping
	//get all plans
	public ResponseEntity<List<Plans>> getPlans(){
		return new ResponseEntity<List<Plans>>(planService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	//add new plan
	public ResponseEntity<Plans> save(@RequestBody Plans plans){
		return new ResponseEntity<Plans>(planService.save(plans), HttpStatus.CREATED);
	}
}
