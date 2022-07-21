package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymobileservice.beans.Plans;

public interface PlansRepository extends JpaRepository<Plans, Integer>{
    
}
