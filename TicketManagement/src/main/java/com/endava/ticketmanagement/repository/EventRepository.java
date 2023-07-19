package com.endava.TicketManagement.repository;

import com.endava.TicketManagement.repository.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
    public Event findByEventName(String name);
}
