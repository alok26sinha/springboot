package com.truno.bi.projection;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Date;

/**
 * Created by Lenovo W520 on 12/24/2017.
 * select t.id, t.locationid, t.loyaltycard, t.transactionnumber, t.transactiondate, t.itemstotal, t.taxestotal, t.grandtotal,
 ui.upc, ui.description, ti.price, ti.quantity
 from ticket t, ticketitem ti, upcinfo ui
 */
public interface TicketItemProjection {
    @Value("#{target.ticket.id}")
    Long getId();
    @Value("#{target.ticket.locationid}")
    Long getLocationid();
    @Value("#{target.ticket.loyaltyCard}")
    String getLoyaltycard();
    @Value("#{target.ticket.transactionNumber}")
    Integer getTransactionnumber();
    @Value("#{target.ticket.transactionDate}")
    Date getTransactiondate();
    @Value("#{target.ticket.itemsTotal}")
    Float getItemsTotal();
    @Value("#{target.ticket.taxesTotal}")
    Float getTaxestotal();
    @Value("#{target.ticket.grandTotal}")
    Float getGrandtotal();
    @Value("#{target.upcInfo.upc}")
    String getUpc();
    @Value("#{target.upcInfo.description}")
    String getUpcDescription();

    Float getPrice();
    Integer getQuantity();

}
