package com.truno.bi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alok on 12/13/2017.
 */
@Entity
public class DiscountType {
    @Id
    @GeneratedValue
    Long id;
    Integer posDiscountTypeId;
    String discountName;
    Float discountAmount;
    Float discountAmountDelta;
    Float discountPercent;
    Boolean applyTicket;
    Boolean applyItem;
}
