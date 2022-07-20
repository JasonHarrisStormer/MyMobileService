package com.mymobileservice.services;

import com.mymobileservice.services.IAccount;
import java.util.List;
import org.springframework.stereotype.Service;

import com.mymobileservice.data.AccountRepo;

@Service
public class AccountsService implements IAccount {

    private final AccountRepo repo;

    public AccountsService(AccountRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Account> findByEmail(String email){
        return (List<Account>) repo.findByEmail(email);
    }

    @Override
    public List<Account> findById(int id){
        return (List<Account>) repo.findById(id);
    }
}
