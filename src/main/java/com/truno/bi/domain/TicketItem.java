package com.truno.bi.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by alok on 12/13/2017.
 */
@Entity(name = "ticketitem")
public class TicketItem {
    @Id
    @GeneratedValue
    Long id;
    Float price;
    Float netPrice;
    Integer quantity;
    Float discountAmt;
    Integer discountId;
    Timestamp createTimestamp;
    Float pricePerPound;
    Float weight;
    String itemCancelled;
    String overrideApproval;
    Double discountPerPound;
    String itemOverrideIndicator;
    Float itemPoints;
    Float itemSaved;
    String itemType;
    Integer seqItemNumber;
    String taxFlag;
    String keyedIndicator;
    Float actualItemTime;
    String promotionDescription;
    Integer qip;
    Integer itemCost;
    Integer itemMargin;
    String promotionNumber;
    Float promotionAmount;

    @ManyToOne
    @JoinColumn(name = "upc_info_id")
    UpcInfo upcInfo;

    @ManyToOne
    @JoinColumn(name = "ticketid")
    Ticket ticket;

    public Long getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    public Float getNetPrice() {
        return netPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Float getDiscountAmt() {
        return discountAmt;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public Timestamp getCreateTimestamp() {
        return createTimestamp;
    }

    public Float getPricePerPound() {
        return pricePerPound;
    }

    public Float getWeight() {
        return weight;
    }

    public String getItemCancelled() {
        return itemCancelled;
    }

    public String getOverrideApproval() {
        return overrideApproval;
    }

    public Double getDiscountPerPound() {
        return discountPerPound;
    }

    public String getItemOverrideIndicator() {
        return itemOverrideIndicator;
    }

    public Float getItemPoints() {
        return itemPoints;
    }

    public Float getItemSaved() {
        return itemSaved;
    }

    public String getItemType() {
        return itemType;
    }

    public Integer getSeqItemNumber() {
        return seqItemNumber;
    }

    public String getTaxFlag() {
        return taxFlag;
    }

    public String getKeyedIndicator() {
        return keyedIndicator;
    }

    public Float getActualItemTime() {
        return actualItemTime;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public Integer getQip() {
        return qip;
    }

    public Integer getItemCost() {
        return itemCost;
    }

    public Integer getItemMargin() {
        return itemMargin;
    }

    public String getPromotionNumber() {
        return promotionNumber;
    }

    public Float getPromotionAmount() {
        return promotionAmount;
    }

    public UpcInfo getUpcInfo() {
        return upcInfo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    //Promotion promotion;

}
