package com.mymobileservice.data;

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

    @Transactional(timeout = 2)
    @Query(value="select * from account a where a.id = :id",
       nativeQuery = true )
    public Account findMyId(@Param("id") int id);

}
