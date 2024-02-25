package com.kbtg.bootcamp.posttest.Controller;

import com.kbtg.bootcamp.posttest.Request.CreateLotteryRequest;
import com.kbtg.bootcamp.posttest.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/admin/lotteries")
    public ResponseEntity CreateLotteriesTicket(@RequestBody CreateLotteryRequest createLotteryRequest) {
        return new ResponseEntity(adminService.createLottery(createLotteryRequest), HttpStatus.CREATED);
    }
}
