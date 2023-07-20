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
@Table(name = "venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueID;

    @Column(name = "venueLocation")
    private String venueLocation;

    @Column(name = "venueType")
    private String venueType;

    @Column(name = "venueCapacity")
    private int venueCapacity;

    @OneToMany(mappedBy = "venue",cascade = CascadeType.ALL)
    private List<Event> eventList = new ArrayList<>();
}
