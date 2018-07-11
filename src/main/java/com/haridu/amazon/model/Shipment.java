package com.haridu.amazon.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address shippingAddress;

    @OneToMany
    @JoinColumn(name = "shipment_id")
    private List<OrderLineItem> orderLineItems;

    private Date shippedDate;
    private Date deliveryDate;
}
