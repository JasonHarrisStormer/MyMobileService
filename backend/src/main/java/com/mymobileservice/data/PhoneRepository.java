package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>{
    
}