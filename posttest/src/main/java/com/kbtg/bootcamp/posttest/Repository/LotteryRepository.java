package com.kbtg.bootcamp.posttest.Repository;

import com.kbtg.bootcamp.posttest.Entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LotteryRepository extends CrudRepository<Lottery, Long> {
}