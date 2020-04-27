package com.truno.bi.domain;

/**
 * Created by alok on 12/13/2017.
 */

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue
    Long id;

    public Long getLocationid() {
        return locationid;
    }

    public DiscountType getDiscount() {
        return discount;
    }

    Long locationid;
    Integer posTicketId;
    Integer posEmployeeId;
    @Column(name="itemstotal")
    Float itemsTotal;
    @Column(name="taxestotal")
    Float taxesTotal;
    Integer discountAmount;
    @Column(name="grandtotal")
    Float grandTotal;
    Float paymentTotal;
    @OneToOne
    @JoinColumn(name = "discountid")
    DiscountType discount;
    Integer reasonId;
    String lane;
    Integer override;
    Integer offline;
    Boolean trainingMode;
    Boolean recalledTransaction;
    @Column(name="transactiondate")
    Date transactionDate;
    @Column(name="transactionnumber")
    Integer transactionNumber;
    Timestamp transactionTime;
    Boolean cancelled;
    Time ticketTime;
    Time tenderTime;
    Time idleTime;
    Time secureTime;
    @Column(name="transactionitems")
    Integer transactionItems;
    @Column(name="loyaltycard")
    String loyaltyCard;
    String noSalesFlag;

    @OneToMany
    Set<TicketItem> ticketItems;


    public Set<TicketItem> getTicketItems() {
        return ticketItems;
    }

    public Long getId() {
        return id;
    }

    public Integer getPosTicketId() {
        return posTicketId;
    }

    public Integer getPosEmployeeId() {
        return posEmployeeId;
    }

    public Float getItemsTotal() {
        return itemsTotal;
    }

    public Float getTaxesTotal() {
        return taxesTotal;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public Float getGrandTotal() {
        return grandTotal;
    }

    public Float getPaymentTotal() {
        return paymentTotal;
    }

   /* public DiscountType getDiscount() {
        return discount;
    }*/

    public Integer getReasonId() {
        return reasonId;
    }

    public String getLane() {
        return lane;
    }

    public Integer getOverride() {
        return override;
    }

    public Integer getOffline() {
        return offline;
    }

    public Boolean getTrainingMode() {
        return trainingMode;
    }

    public Boolean getRecalledTransaction() {
        return recalledTransaction;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public Time getTicketTime() {
        return ticketTime;
    }

    public Time getTenderTime() {
        return tenderTime;
    }

    public Time getIdleTime() {
        return idleTime;
    }

    public Time getSecureTime() {
        return secureTime;
    }

    public Integer getTransactionItems() {
        return transactionItems;
    }

    public String getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getNoSalesFlag() {
        return noSalesFlag;
    }



    private Ticket() {
    }
}
