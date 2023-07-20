package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.EventType;
import com.endava.TicketManagement.repository.model.Venue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDto {
    private Long eventDtoID;
    private String eventDescription;
    private String eventName;
    private Date eventStartDate;
    private Date getEventEndDate;
    private Venue venue;
    private EventType eventType;
}
