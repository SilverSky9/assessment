package com.kbtg.bootcamp.posttest.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_ticket")
public class UserTicket {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "lottery_id")
    private Long lotteryId;

    @Column(name = "number")
    private String number;

}
