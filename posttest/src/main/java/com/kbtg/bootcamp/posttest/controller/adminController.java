package com.kbtg.bootcamp.posttest.Controller;

import com.kbtg.bootcamp.posttest.Request.CreateLotteryRequest;
import com.kbtg.bootcamp.posttest.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {

    @Autowired
    AdminService adminService;
    
    @PostMapping("/admin/lotteries")
    public ResponseEntity createLotteriesTicket(@RequestBody CreateLotteryRequest createLotteryRequest){
//        adminService.createLottery(createLotteryRequest);
        return new ResponseEntity(adminService.createLottery(createLotteryRequest), HttpStatus.CREATED);
    }
}
