package com.endava.TicketManagement.repository;

import com.endava.TicketManagement.repository.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    public Event findByEventName(String name);
    public Event findByEventID(Long id);
}
