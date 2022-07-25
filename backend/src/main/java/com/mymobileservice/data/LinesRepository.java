package com.mymobileservice.data;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Lines;

@Repository
public interface LinesRepository extends JpaRepository<Lines, String>{

    @Query(value = "select * from phoneline p where p.phonenumber = :phone",
        nativeQuery=true)
    public Optional<Lines> findByNumberLike(@Param("phone") String phonenumber);
    

    @Query(value = "select * from phoneline p where p.accountid = :account",
        nativeQuery=true)
    public Optional<Lines> findByAccountIdLike(@Param("account") int accountid);
}
