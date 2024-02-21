package com.kbtg.bootcamp.posttest.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateLotteryRequest {

    public String ticket;
    public Long price;
    public int amount;
}
