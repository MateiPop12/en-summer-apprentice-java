package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.Customer;
import com.endava.TicketManagement.repository.model.TicketCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Long orderID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private float totalPrice;
    private Customer customer;
    private TicketCategory ticketCategory;
}
