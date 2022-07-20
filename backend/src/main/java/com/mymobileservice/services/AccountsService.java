package com.mymobileservice.services;


import java.util.List;
import org.springframework.stereotype.Service;

import com.mymobileservice.data.AccountRepo;
import com.mymobileservice.models.AccountModel;

@Service
public class AccountsService {

    private final AccountRepo repo;

    public AccountsService(AccountRepo repo) {
        this.repo = repo;
    }

    @Override
    public AccountModel findByEmail(String email){
        return repo.findByEmail(email);
    };

    @Override
    public AccountModel findById(int id){
        return repo.findById(id);
    };
}
