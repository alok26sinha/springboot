package com.truno.bi.repository;

import com.truno.bi.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

/**
 * Created by Lenovo W520 on 12/21/2017.
 */
public interface TicketRepository extends CrudRepository<Ticket, Long> {

    List<Ticket> findAllByLocationidAndTransactionDateBetween(Long locationid, Date startDate, Date endDate);
}
