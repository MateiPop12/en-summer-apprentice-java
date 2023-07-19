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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;
    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerEmail")
    private String customerEmail;

    @OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
    private List<Event> eventList = new ArrayList<>();
}
