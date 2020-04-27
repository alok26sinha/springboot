package com.truno.bi.controller;

import com.truno.bi.domain.Ticket;
import com.truno.bi.projection.TicketItemProjection;
import com.truno.bi.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by alok on 12/22/2017.
 */
@RestController
public class ReceiptController {

    ReceiptService receiptService;

    @Autowired
    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @RequestMapping(value = {"/receipt/{locationid}/{startDate}&{endDate}", "/receipt/{locationid}/{page}/{startDate}&{endDate}"}, method = RequestMethod.GET)
    public List<TicketItemProjection> getReceipts(@PathVariable Long locationid, @PathVariable Date startDate, @PathVariable Date endDate, @PathVariable Optional<Integer> page){
        if(page.isPresent()){
            return receiptService.getTickets(locationid,startDate, endDate, page.get()-1);
        }else{
            return receiptService.getTickets(locationid,startDate, endDate, 0);
        }

    }


}
