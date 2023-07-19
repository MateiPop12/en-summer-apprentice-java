package com.endava.TicketManagement.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderID;

    @Column(name = "orderedAt")
    private Date orderedAt;

    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "totALlPrice")
    private float totalPrice;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

}