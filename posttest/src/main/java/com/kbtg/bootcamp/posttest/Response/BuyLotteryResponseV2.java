package com.kbtg.bootcamp.posttest.Response;

import lombok.Data;

import java.util.List;

@Data
public class BuyLotteryResponseV2 {
    private List<String> tickets;
    private int count;
    private int cost;
}
