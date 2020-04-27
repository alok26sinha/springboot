package com.truno.bi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alok on 12/13/2017.
 */
@Entity
public class Sku {
    @Id
    @GeneratedValue
    Long id;
    String item;
    String dateAdded;

}
