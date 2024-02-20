package com.kbtg.bootcamp.posttest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {

    @GetMapping("/admin")
    public ResponseEntity getHealth(){
        System.out.println("Backend is health!!!");
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
