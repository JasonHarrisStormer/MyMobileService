package com.mymobileservice.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymobileservice.beans.Lines;

@Repository
public interface LinesRepository extends JpaRepository<Lines, String>{

    public List<Lines> findByNameLike(String name);
    
}
