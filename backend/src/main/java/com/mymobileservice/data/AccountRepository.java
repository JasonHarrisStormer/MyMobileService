package com.mymobileservice.data;

import org.springframework.data.repository.CrudRepository;

import com.mymobileservice.beans.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{
    
}
