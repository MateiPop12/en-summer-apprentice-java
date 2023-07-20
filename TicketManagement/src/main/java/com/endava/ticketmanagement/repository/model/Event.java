package com.endava.TicketManagement.repository.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
    @OneToMany(mappedBy = "event",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<TicketCategory>ticketCategoryList = new ArrayList<>();

    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "venueID")
    private Venue venue;

    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;


}
