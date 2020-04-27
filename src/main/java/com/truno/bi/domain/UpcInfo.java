package com.truno.bi.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by alok on 12/13/2017.
 */
@Entity(name="upcinfo")
public class UpcInfo {
    @Id
    @GeneratedValue
    Long id;

    public Long getId() {
        return id;
    }

    public String getUpc() {
        return upc;
    }

    public String getDescription() {
        return description;
    }

    public Sku getSku() {
        return sku;
    }

    public String getVolume() {
        return volume;
    }

    String upc;
    String description;
    @OneToOne
    Sku sku;
    String volume;

}
