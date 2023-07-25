package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import com.endava.TicketManagement.service.dto.OrderRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/findByNumberOfTickets/{numberOfTickets}", method = RequestMethod.GET)
    public List<OrderDto> findByNumberOfTickets(@PathVariable int numberOfTickets) {
        System.out.println("Request order/findByNumberOfTickets/" + numberOfTickets);
        return orderService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/findByCustomerID/{customerID}",method = RequestMethod.GET)
    public OrderDto findByCustomerCustomerID(@PathVariable Long customerID){
        System.out.println("Request order/findByCustomerID/" + customerID);
        return orderService.findByCustomerCustomerID(customerID);
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrderDto> findAll() {
        System.out.println("Request order/all");
        return orderService.findAll();
    }

    @PostMapping(value = "/create/{customerID}", produces = {"application/json"}, consumes = {"application/json"})
    public OrderDto createOrder(@RequestBody OrderRequestDto orderRequestDto, @PathVariable Long customerID) {
        System.out.println(orderRequestDto);
        return orderService.createOrder(orderRequestDto, customerID);
    }
}

