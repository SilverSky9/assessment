package com.kbtg.bootcamp.posttest.Service;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import com.kbtg.bootcamp.posttest.Entity.UserTicket;
import com.kbtg.bootcamp.posttest.Repository.LotteryRepository;
import com.kbtg.bootcamp.posttest.Repository.UserTicketRepository;
import com.kbtg.bootcamp.posttest.Response.BuyLotteryResponseV2;
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

    public BuyLotteryResponseV2 buyLotteries(String userId, String ticketId) {
        var availableTicketId = lotteryRepository.findByNumber(ticketId).getNumber();
        var userTicketItem = createUserTicket(availableTicketId, userId);
        userTicketRepository.save(userTicketItem).getId().toString();

        var userTicketByUserId = userTicketRepository.findByUserId(Long.valueOf(userId));
        BuyLotteryResponseV2 buyLotteryResponse = new BuyLotteryResponseV2();
        buyLotteryResponse.setTickets(userTicketByUserId.stream().map(UserTicket::getNumber).toList());
        buyLotteryResponse.setCount(userTicketByUserId.size());
        buyLotteryResponse.setCost(userTicketByUserId.stream().mapToInt(UserTicket::getPrice).sum());
        return buyLotteryResponse;
    }
    private UserTicket createUserTicket(String availableTicketId, String userId) {
        Lottery lottery = lotteryRepository.findByNumber(availableTicketId);
        UserTicket userTicket = new UserTicket();
        userTicket.setLotteryId(lottery.getId());
        userTicket.setUserId(Long.parseLong(userId));
        userTicket.setNumber(lottery.getNumber());
        userTicket.setPrice(lottery.getPrice());
        return userTicket;
    }

}
