package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.EventService;
import com.endava.TicketManagement.service.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;
    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @RequestMapping(value = "/find/{eventName}", method = RequestMethod.GET)
    public EventDto findByEventName(@PathVariable String eventName){
        System.out.println("Request order/find/" + eventName);
        return eventService.findByEventName(eventName);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<EventDto> findAll(){
        System.out.println("Request order/all");
        return eventService.findAll();
    }
}
