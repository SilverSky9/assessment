package com.kbtg.bootcamp.posttest;


import com.kbtg.bootcamp.posttest.Controller.AdminController;
import com.kbtg.bootcamp.posttest.Request.CreateLotteryRequest;
import com.kbtg.bootcamp.posttest.Response.CreateLotteryResponse;
import com.kbtg.bootcamp.posttest.Service.AdminService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

class AdminControllerTest {

    @InjectMocks
    AdminController adminController;

    @Mock
    AdminService adminService;

    @Test
    void createLotteriesTicket() {
//        CreateLotteryRequest request = new CreateLotteryRequest();
//        request.setTicket("12345");
//        request.setAmount(1);
//        request.setPrice(80L);
//        CreateLotteryResponse response = CreateLotteryResponse.builder().ticket("12345").build();
//        ResponseEntity<CreateLotteryResponse> responseResponseEntity = new ResponseEntity<>(response, HttpStatus.CREATED);
//
//        when(adminService.createLottery(request)).thenReturn(response);
//        when(adminController.CreateLotteriesTicket(request)).thenReturn(responseResponseEntity);
//
//        ResponseEntity<CreateLotteryResponse> testResponse = adminController.CreateLotteriesTicket(request);
//        Assertions.assertEquals(HttpStatus.CREATED, testResponse.getStatusCode());
    }
}
