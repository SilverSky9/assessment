package com.kbtg.bootcamp.posttest.Service;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import com.kbtg.bootcamp.posttest.Repository.LotteryRepository;
import com.kbtg.bootcamp.posttest.Request.CreateLotteryRequest;
import com.kbtg.bootcamp.posttest.Response.CreateLotteryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminService {
    @Autowired
    LotteryRepository lotteryRepository;

    public CreateLotteryResponse createLottery(CreateLotteryRequest request){
       Lottery lottery = new Lottery();
       lottery.setNumber(request.getTicket());
       lottery.setPrice(Math.toIntExact(request.getPrice()));
       lottery.setAmount(request.getAmount());
       lotteryRepository.save(lottery);

       return CreateLotteryResponse.builder()
               .ticket(request.getTicket())
               .build();
    }
}
