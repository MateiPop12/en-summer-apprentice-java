package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
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
    public List<OrderDto> findByNumberOfTickets(@PathVariable int numberOfTickets){
        System.out.println("Request order/find/" + numberOfTickets);
        return orderService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<OrderDto> findAll(){
        System.out.println("Request order/all");
        return orderService.findAll();
    }

    @PostMapping("/create/{customerID}")
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto, @PathVariable Long customerID){
        OrderDto savedOrderDto = new OrderDto();
        orderService.createOrder(orderDto,customerID);
        return ResponseEntity.ok(savedOrderDto);
    }
}
