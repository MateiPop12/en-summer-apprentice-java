package com.endava.TicketManagement.service.mapper;

import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.service.dto.OrderDto;
public class OrderToOrderDtoMapper {
    public static OrderDto converter(Order order){
        return  new OrderDto();
    }
}
