package com.mymobileservice.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Phone;
import com.mymobileservice.models.PhoneModel;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>{
    
    //public PhoneModel findByNameLike(String name);

    // @Query("from phoneinfo where price <= :price")
    // public List<Phone> findByPriceLesserThan(double price);

    // @Query("from phoneinfo where price >= :price")
    // public List<Phone> findByPriceGreaterThan(double price);
}