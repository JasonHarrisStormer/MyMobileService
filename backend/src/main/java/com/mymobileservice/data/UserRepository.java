package com.mymobileservice.data;



import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.mymobileservice.beans.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    @Transactional(timeout = 1)
    public Optional<User> findByEmailLike(String email);

    
}
