package com.endava.TicketManagement.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventID;

    @Column(name = "eventDescription")
    private String eventDescription;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "eventStartDate")
    private Date eventStartDate;

    @Column(name = "eventEndDate")
    private Date getEventEndDate;

    @OneToMany(mappedBy = "event",cascade = CascadeType.ALL)
    private List<TicketCategory>ticketCategoryList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;


}
