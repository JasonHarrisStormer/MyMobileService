package com.mymobileservice.data;



import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.mymobileservice.beans.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

    @Transactional(timeout = 1)
    public Optional<Users> findByEmailLike(String email);

    
}
