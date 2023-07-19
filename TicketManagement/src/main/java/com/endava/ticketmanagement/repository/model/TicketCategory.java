package com.endava.TicketManagement.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "ticketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketCategoryID;

    @Column(name = "ticketCategoryDescription")
    private String ticketCategoryDescription;

    @Column(name = "ticketCategoryPrice")
    private float ticketCategoryPrice;

    @OneToMany(mappedBy = "TicketCategory",cascade = CascadeType.ALL)
    private List<Order> orderList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;
}
