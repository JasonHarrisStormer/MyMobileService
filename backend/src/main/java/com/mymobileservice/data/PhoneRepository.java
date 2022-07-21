package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymobileservice.beans.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer>{

}
