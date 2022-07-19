package com.mymobileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mymobileservice.services.MobileService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
@ResponseBody
public class MobileController {
  @Autowired
  MobileService myMobileService;


  @GetMapping("/account")
  public List<Account> getAccount(@RequestParam String email){
    return myMobileService.findByCriteria(email);
  }

}
