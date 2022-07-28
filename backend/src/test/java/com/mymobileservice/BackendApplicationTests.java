package com.mymobileservice;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mymobileservice.services.AccountService;
import com.mymobileservice.services.LinesService;
import com.mymobileservice.services.PhoneService;
import com.mymobileservice.services.PlansService;
import com.mymobileservice.services.UsersService;

import io.swagger.v3.oas.annotations.tags.Tag;

@SpringBootTest
@Tag(name = "Testing Backend")
class BackendApplicationTests {

	@Autowired
	AccountService accService;
	@Autowired
	LinesService lineService;
	@Autowired
	UsersService userService;
	@Autowired
	PhoneService phoneService;
	@Autowired
	PlansService plansService;

	//private Logger log;

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testAccount() {
		//(accService.findAll());
		
	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testLines() {

	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testPhones() {

	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testPlans() {

	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testUsers() {

	}

}
