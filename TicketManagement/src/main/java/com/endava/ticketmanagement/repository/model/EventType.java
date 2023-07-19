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
@Table(name = "eventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

    @OneToMany(mappedBy = "eventType",cascade = CascadeType.ALL)
    private List<Event> eventList = new ArrayList<>();
}
