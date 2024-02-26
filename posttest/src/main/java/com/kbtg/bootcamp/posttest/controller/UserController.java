package com.kbtg.bootcamp.posttest.Controller;
import com.kbtg.bootcamp.posttest.Response.BuyLotteryResponse;
import com.kbtg.bootcamp.posttest.Response.BuyLotteryResponseV2;
import com.kbtg.bootcamp.posttest.Response.Lotteries;
import com.kbtg.bootcamp.posttest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/lotteries")
    public ResponseEntity<Lotteries> getLotteries() {
        List<String> allLotteries = userService.getAllLotteries();
        Lotteries lotteries = new Lotteries();
        lotteries.setTickets(allLotteries);
        return new ResponseEntity(lotteries, org.springframework.http.HttpStatus.OK);

    }

    @PostMapping("/users/{userId}/lotteries/{ticketId}")
    public ResponseEntity<Lotteries> buyLotteries(@PathVariable String userId, @PathVariable String ticketId) {
        BuyLotteryResponseV2 response = userService.buyLotteries(userId, ticketId);
        return new ResponseEntity(response, org.springframework.http.HttpStatus.CREATED);

    }


}
