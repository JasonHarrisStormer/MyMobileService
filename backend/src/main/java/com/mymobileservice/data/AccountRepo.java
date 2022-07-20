package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.beans.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

}
