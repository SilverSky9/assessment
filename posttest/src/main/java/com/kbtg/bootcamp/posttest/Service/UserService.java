package com.kbtg.bootcamp.posttest.Service;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import com.kbtg.bootcamp.posttest.Entity.UserTicket;
import com.kbtg.bootcamp.posttest.Repository.LotteryRepository;
import com.kbtg.bootcamp.posttest.Repository.UserTicketRepository;
import com.kbtg.bootcamp.posttest.Response.BuyLotteryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    LotteryRepository lotteryRepository;

    @Autowired
    UserTicketRepository userTicketRepository;

    public List<String> getAllLotteries() {
        List<String> allLotteries = new ArrayList<>();
        Iterable<Lottery> lotteriesList = lotteryRepository.findAll();
        lotteriesList.forEach(lottery -> {
            allLotteries.add(lottery.getNumber());

        });
        return allLotteries;
    }

    public BuyLotteryResponse buyLotteries(String userId, String ticketId) {
        var availableTicketId = lotteryRepository.findById(Long.parseLong(ticketId)).get().getId().toString();
        var userTicketItem = createUserTicket(availableTicketId, userId, ticketId);
        String id = userTicketRepository.save(userTicketItem).getId().toString();
        BuyLotteryResponse buyLotteryResponse = new BuyLotteryResponse();
        buyLotteryResponse.setId(availableTicketId);
        return buyLotteryResponse;
    }

    private String findTicketId(String ticketId) {
        return lotteryRepository.findById(Long.parseLong(ticketId)).get().getNumber();
    }
    private UserTicket createUserTicket(String availableTicketId, String userId, String ticketId) {
        UserTicket userTicket = new UserTicket();
        userTicket.setLotteryId(Long.valueOf(availableTicketId));
        userTicket.setUserId(Long.valueOf(userId));
        userTicket.setNumber(findTicketId(ticketId));
        return userTicket;
    }

}
