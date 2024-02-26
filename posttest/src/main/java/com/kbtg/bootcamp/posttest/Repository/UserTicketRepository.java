package com.kbtg.bootcamp.posttest.Repository;

import com.kbtg.bootcamp.posttest.Entity.UserTicket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserTicketRepository extends CrudRepository<UserTicket, Long> {

    List<UserTicket> findByUserId(Long userId);
}
