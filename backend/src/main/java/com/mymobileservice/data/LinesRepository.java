package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Lines;

@Repository
public interface LinesRepository extends JpaRepository<Lines, String>{

    
}
