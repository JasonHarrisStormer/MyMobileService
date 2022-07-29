package com.mymobileservice;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mymobileservice.beans.Account;
import com.mymobileservice.beans.Lines;
import com.mymobileservice.beans.Phone;
import com.mymobileservice.beans.Plans;
import com.mymobileservice.beans.Users;
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

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testAccount() {
		List<Account> accounts = accService.findAll();
		log.info(accounts.toString());
		Assertions.assertNotNull(accounts);
	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testLines() {
		List<Lines> lines = lineService.findAll();
		log.info(lines.toString());
		Assertions.assertNotNull(lines);

	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testPhones() {
		List<Phone> phones = phoneService.findAll();
		log.info(phones.toString());
		Assertions.assertNotNull(phones);
	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testPlans() {
		List<Plans> plans = plansService.findAll();
		log.info(plans.toString());
		Assertions.assertNotNull(plans);
	}

	@Test
	@Transactional // rolls back because it is a test method, normally does not
	void testUsers() {
		List<Users> users = userService.findAll();
		log.info(users.toString());
		Assertions.assertNotNull(users);
	}

}
