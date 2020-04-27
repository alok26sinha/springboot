package com.truno.bi.repository;

import com.truno.bi.domain.TicketItem;
import com.truno.bi.projection.TicketItemProjection;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

/**
 * Created by alok on 12/24/2017.
 */
public interface TicketItemRepository extends CrudRepository<TicketItem, Long> {

    List<TicketItemProjection> findAllByItemCancelledIsNullAndTicket_LocationidAndTicket_CancelledAndTicket_TransactionDateBetween(Long locationid, Boolean flag, Date startDate, Date endDate, Pageable pageable );
}
