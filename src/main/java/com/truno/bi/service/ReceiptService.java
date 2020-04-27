package com.truno.bi.service;

import com.truno.bi.domain.Ticket;
import com.truno.bi.projection.TicketItemProjection;
import com.truno.bi.repository.TicketItemRepository;
import com.truno.bi.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;

/**
 * Created by Lenovo W520 on 12/22/2017.
 */
@Service
public class ReceiptService {
    @Autowired
    TicketItemRepository ticketItemRepository;

    @Value( "${pageSize}" )
    private Integer pageSize;

    public List<TicketItemProjection> getTickets(Long locationid, Date startDate, Date endDate, Integer page) {
        Pageable pageable = new PageRequest(page, pageSize);
        return (List<TicketItemProjection>) ticketItemRepository.findAllByItemCancelledIsNullAndTicket_LocationidAndTicket_CancelledAndTicket_TransactionDateBetween(locationid, false, startDate, endDate, pageable);
    }


}
