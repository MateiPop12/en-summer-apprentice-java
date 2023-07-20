package com.endava.TicketManagement.service.implementation;

import com.endava.TicketManagement.repository.OrderRepository;
import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import com.endava.TicketManagement.service.mapper.OrderToOrderDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImplementation implements OrderService {
    private OrderRepository orderRepository;
    @Autowired
    public OrderServiceImplementation(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDto findByNumberOfTickets(int numberOfTickets) {
        return OrderToOrderDtoMapper.converter(orderRepository.findByNumberOfTickets(numberOfTickets));
    }

    @Override
    public List<OrderDto> findAll() {
        return orderRepository.findAll().stream().map(OrderToOrderDtoMapper::converter).collect(Collectors.toList());
    }

    @Override
    public OrderDto create(OrderDto orderDto) {
        Order order = new Order();
        order.setNumberOfTickets(orderDto.getNumberOfTickets());
        order.setTicketCategory(orderDto.getTicketCategory());

        return null;
    }


}
