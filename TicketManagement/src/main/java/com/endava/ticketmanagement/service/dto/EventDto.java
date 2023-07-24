package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.EventType;
import com.endava.TicketManagement.repository.model.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonSerialize
public class EventDto {
    private Long eventDtoID;
    private String eventDescription;
    private String eventName;
    private Date eventStartDate;
    private Date getEventEndDate;
    private Venue venue;
    private EventType eventType;

}
