package com.mymobileservice.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
    
    //public Account save(Account account);
    public List<Account> findByNameLike(String name);

    @Transactional(timeout = 1)
    public Optional<Account> findByEmailLike(String email);

    public Account save(Account account);

}
