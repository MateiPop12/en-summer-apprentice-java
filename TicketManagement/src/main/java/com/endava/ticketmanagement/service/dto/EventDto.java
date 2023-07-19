package com.endava.TicketManagement.service.dto;

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
}
