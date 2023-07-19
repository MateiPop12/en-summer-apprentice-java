package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.EventService;
import com.endava.TicketManagement.service.dto.EventDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/find/{eventName}", method = RequestMethod.GET)
    public EventDto findByEventName(@PathVariable String eventName){
        return eventService.findByEventName(eventName);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<EventDto> findAll(){
        return eventService.findAll();
    }
}
