package com.endava.TicketManagement.service;

import com.endava.TicketManagement.service.dto.OrderDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderService {
    public List<OrderDto> findByNumberOfTickets(int numberOfTickets);
    public List<OrderDto> findAll();
    public  void createOrder(OrderDto orderDto,Long orderID);
}
