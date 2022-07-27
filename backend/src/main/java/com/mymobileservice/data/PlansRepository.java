package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mymobileservice.beans.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer>{

    @Transactional(timeout = 2)
    @Query(value = "select price from plans p where p.planid = :planid", 
        nativeQuery = true)
    public double getPlanPrice(@Param("planid") int planid);

}
