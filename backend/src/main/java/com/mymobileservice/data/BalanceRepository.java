package com.mymobileservice.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Balance;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Integer>{
    @Transactional(timeout = 2)
    @Query(value = "select * from balance b where b.accountid = :account",
        nativeQuery=true)
    public List<Balance> findByAccountIdLike(@Param("account") int accountid);

    @Transactional(timeout = 2)
    @Modifying
    @Query(value = "update balance b set b.balance = :balance where b.accountid = :account",
    nativeQuery = true)
    public void updateBalance(@Param("account") int accountid,@Param("balance") double balance);
}
