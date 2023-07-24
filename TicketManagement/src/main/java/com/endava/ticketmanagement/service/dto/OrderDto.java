package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.Customer;
import com.endava.TicketManagement.repository.model.TicketCategory;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonSerialize
public class OrderDto {
    private Long orderID;
    private LocalDateTime orderedAt;
    private int numberOfTickets;
    private float totalPrice;
    @JsonBackReference
    private Customer customer;
    @JsonBackReference
    private TicketCategory ticketCategory;
}
