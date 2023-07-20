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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerID;
    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerEmail")
    private String customerEmail;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> eventList = new ArrayList<>();
}
