package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Event;
import com.endava.TicketManagement.service.dto.EventDto;
public class EventToEventDtoMapper {
    public static EventDto converter(Event event){
        EventDto eventDto = new EventDto();
        eventDto.setEventID(event.getEventID());
        eventDto.setVenue(event.getVenue());
        eventDto.setType(event.getEventType().getEventTypeName());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getEventName());
        eventDto.setEventStartDate(event.getEventStartDate());
        eventDto.setGetEventEndDate(event.getGetEventEndDate());
        eventDto.setTicketCategoryList(event.getTicketCategoryList());
        return  eventDto;
    }
}
