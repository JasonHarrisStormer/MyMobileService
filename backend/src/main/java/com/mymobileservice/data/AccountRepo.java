package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymobileservice.AccountModel;

@Repository
public interface AccountRepo extends JpaRepository<AccountModel, Integer> {

}
