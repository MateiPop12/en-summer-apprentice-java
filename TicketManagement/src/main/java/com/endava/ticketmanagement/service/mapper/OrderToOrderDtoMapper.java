package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.service.dto.OrderDto;

public class OrderToOrderDtoMapper {
    public static OrderDto converter(Order order){
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderID(order.getOrderID());
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        orderDto.setTotalPrice(order.getTotalPrice());
        orderDto.setCustomer(order.getCustomer());
        orderDto.setTicketCategory(order.getTicketCategory());
        return orderDto;
    }
}
