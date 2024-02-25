package com.kbtg.bootcamp.posttest.Service;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import com.kbtg.bootcamp.posttest.Repository.LotteryRepository;
import com.kbtg.bootcamp.posttest.Response.Lotteries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    LotteryRepository lotteryRepository;

    public List<String> getAllLotteries() {
        List<String> allLotteries = new ArrayList<>();
        Iterable<Lottery> lotteriesList = lotteryRepository.findAll();
        lotteriesList.forEach(lottery -> {
            allLotteries.add(lottery.getNumber());

        });
        return allLotteries;
    }
}
