package com.mymobileservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mymobileservice.beans.Account;
import com.mymobileservice.data.AccountRepo;

@Service
public class MobileService {

  @Autowired
  AccountRepo repo;

  public Account save(Account account) {
    return repo.save(account);
  }

  public Account find(String email) {
    return repo.findById(email).get();
  }

  public List<Account> findByCriteria(String phoneNumber) {
    return repo.findAll(findById(phoneNumber)).toList();
  }

}
