package com.kbtg.bootcamp.posttest.Repository;

import com.kbtg.bootcamp.posttest.Entity.UserTicket;
import org.springframework.data.repository.CrudRepository;

public interface UserTicketRepository extends CrudRepository<UserTicket, Long> {
}
