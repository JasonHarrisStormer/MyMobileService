package com.mymobileservice.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

    @Transactional(timeout = 1)
    public Optional<Account> findByEmailLike(String email);

    @Query(value = "insert into users (username,password,enable) values(:email,:password,1)",
        nativeQuery=true)
    public List<Account> loginInfoAccounts(@Param("email") String email, @Param("password") String password);
    
    public Account save(Account account);

}
