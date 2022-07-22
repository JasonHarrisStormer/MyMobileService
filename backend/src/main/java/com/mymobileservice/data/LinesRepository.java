package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymobileservice.beans.Lines;

public interface LinesRepository extends JpaRepository<Lines, String>{
    
}
