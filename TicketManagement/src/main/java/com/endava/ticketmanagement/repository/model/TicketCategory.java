package com.endava.TicketManagement.repository.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @Column(name = "ticketCategoryDescription")
    private String ticketCategoryDescription;

    @Column(name = "ticketCategoryPrice")
    private float ticketCategoryPrice;

    @JsonBackReference
    @OneToMany(mappedBy = "ticketCategory",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Order> orderList = new ArrayList<>();

    @JsonBackReference
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "eventID")
    private Event event;
}
