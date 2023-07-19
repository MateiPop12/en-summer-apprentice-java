package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Event;
import com.endava.TicketManagement.service.dto.EventDto;
public class EventToEventDtoMapper {
    public static EventDto converter(Event event){
        return new EventDto();
    }
}
