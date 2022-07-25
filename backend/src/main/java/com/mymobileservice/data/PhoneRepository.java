package com.mymobileservice.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>{
    
    @Query(value = "select * from phoneinfo p where p.price < :price1 or p.price = :price1",
        nativeQuery=true)
    public List<Phone> findByPriceLesserThan(@Param("price1") double price);

    @Query(value = "select * from phoneinfo p where p.price < :price2 or p.price = :price2",
        nativeQuery=true)
    public List<Phone> findByPriceGreaterThan(@Param("price2") double price);

    @Query(value = "select * from phoneinfo p where p.model LIKE %:name%",
        nativeQuery=true)
    public List<Phone> findByPhones(@Param("name") String model);
}