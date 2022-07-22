package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer>{
    
}
