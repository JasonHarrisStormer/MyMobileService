package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.services.LinesService;

@RestController
@RequestMapping("/lineinfo/v1")
@CrossOrigin("http://localhost:4200")
public class LinesController {
    @Autowired
    LinesService linesService;

    @PostMapping(path="/add")
    public ResponseEntity<Lines> save(@RequestBody Lines line){

        return new ResponseEntity<Lines>(linesService.save(line), HttpStatus.CREATED);

    }

    @GetMapping(path="/all")
    public ResponseEntity<List<Lines>> findAll(){ 
        return new ResponseEntity<List<Lines>>(linesService.findAll(), HttpStatus.OK);
    }
}
