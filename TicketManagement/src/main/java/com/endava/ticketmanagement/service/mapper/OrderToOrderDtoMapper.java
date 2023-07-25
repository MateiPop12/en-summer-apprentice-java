package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.service.dto.OrderDto;

public class OrderToOrderDtoMapper {
    public static OrderDto converter(Order order){
        OrderDto orderDto = new OrderDto();
        orderDto.setEventID(order.getTicketCategory().getEvent().getEventID());
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setTicketCategoryID(order.getTicketCategory().getTicketCategoryID());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        orderDto.setTotalPrice(order.getTotalPrice());
        return orderDto;
    }
}
