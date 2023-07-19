package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/find/{numberOfTickets}",method = RequestMethod.GET)
    public OrderDto findByNumberOfTickets(@PathVariable int numberOfTickets){
        return orderService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrderDto> findAll(){return orderService.findAll();}
}
