package com.endava.TicketManagement.service;

import com.endava.TicketManagement.service.dto.EventDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface EventService {
    public EventDto findByEventName(String name);
    public List<EventDto> findAll();
}
