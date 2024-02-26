package com.kbtg.bootcamp.posttest.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "lottery")
public class Lottery {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "price")
    private int price;

    @Column(name = "amount")
    private int amount;

}