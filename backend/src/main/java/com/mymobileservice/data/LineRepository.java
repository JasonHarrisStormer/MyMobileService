package com.mymobileservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymobileservice.beans.Line;

public interface LineRepository extends JpaRepository<Line, Integer> {

}
