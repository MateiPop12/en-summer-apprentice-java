package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.repository.OrderRepository;
import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;
    @Autowired
    OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @RequestMapping(value = "/find/{numberOfTickets}",method = RequestMethod.GET)
    public OrderDto findByNumberOfTickets(@PathVariable int numberOfTickets){
        return orderService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrderDto> findAll(){return orderService.findAll();}

    @PostMapping("/create")
    public ResponseEntity<OrderDto> create(@RequestBody OrderDto orderDto){
        OrderDto savedOrderDto = orderService.create(orderDto);
        return ResponseEntity.ok(savedOrderDto);
    }
}
