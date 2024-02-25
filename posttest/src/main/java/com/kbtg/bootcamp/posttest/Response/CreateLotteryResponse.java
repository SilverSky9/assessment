package com.kbtg.bootcamp.posttest.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateLotteryResponse {
    public String ticket;
}
