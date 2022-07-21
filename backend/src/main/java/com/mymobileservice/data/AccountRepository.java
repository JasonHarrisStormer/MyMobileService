package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.mymobileservice.beans.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
    
}
