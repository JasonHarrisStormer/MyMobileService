package com.mymobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymobileservice.beans.Lines;
import com.mymobileservice.models.LinesModel;
import com.mymobileservice.services.LinesService;

@RestController
@RequestMapping("/lineinfo/v1")
@CrossOrigin("http://localhost:4200")
public class LinesController {
    @Autowired
    LinesService linesService;


    // @PostMapping("/save")
    // public ResponseEntity<LinesModel> save(@RequestBody LinesModel newLine){
    //     return new ResponseEntity<LinesModel>(linesService.add(newLine), HttpStatus.CREATED);
    // }

    @PostMapping
    public ResponseEntity<LinesModel> save(@RequestBody LinesModel newLine){
        return new ResponseEntity<LinesModel>(linesService.add(newLine), HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<LinesModel>> findAll(){ 
        List<LinesModel> models = linesService.findAll();
        return new ResponseEntity<List<LinesModel>>(models, HttpStatus.OK);
    }

    @GetMapping("/number/{id}")
    public ResponseEntity<LinesModel> findOne(@PathVariable int id){
        return new ResponseEntity<LinesModel>(linesService.findByNumber(id), HttpStatus.OK);
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<LinesModel> findOneAccount(@PathVariable int id){
        return new ResponseEntity<LinesModel>(linesService.findByAccountNumber(id), HttpStatus.OK);
    }
}
