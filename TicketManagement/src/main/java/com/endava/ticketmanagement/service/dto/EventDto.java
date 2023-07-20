package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.EventType;
import com.endava.TicketManagement.repository.model.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.Date;


@JsonSerialize
public class EventDto {
    public EventDto(){};
    private Long eventDtoID;
    private String eventDescription;
    private String eventName;
    private Date eventStartDate;
    private Date getEventEndDate;
    private Venue venue;
    private EventType eventType;

    public Long getEventDtoID() {
        return eventDtoID;
    }

    public void setEventDtoID(Long eventDtoID) {
        this.eventDtoID = eventDtoID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Date getGetEventEndDate() {
        return getEventEndDate;
    }

    public void setGetEventEndDate(Date getEventEndDate) {
        this.getEventEndDate = getEventEndDate;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
