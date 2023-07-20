package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Event;
import com.endava.TicketManagement.service.dto.EventDto;
public class EventToEventDtoMapper {
    public static EventDto converter(Event event){
        EventDto eventDto = new EventDto();
        eventDto.setEventDtoID(event.getEventID());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getEventName());
        eventDto.setEventStartDate(event.getEventStartDate());
        eventDto.setGetEventEndDate(event.getGetEventEndDate());
        eventDto.setVenue(event.getVenue());
        eventDto.setEventType(event.getEventType());
        return  eventDto;
    }
}
