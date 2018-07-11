package com.haridu.amazon.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany
    @JoinColumn(name = "account_id")
    private List<Order> orders;

    @OneToMany
    @JoinColumn(name = "account_id")
    private List<Shipment> shipments;
}
