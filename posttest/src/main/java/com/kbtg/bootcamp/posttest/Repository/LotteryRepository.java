package com.kbtg.bootcamp.posttest.Repository;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface LotteryRepository extends CrudRepository<Lottery, Long> {
    Lottery findByNumber(String number);

    List<Lottery> findByUserId(Long userId);
}