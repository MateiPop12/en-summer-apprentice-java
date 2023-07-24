package com.endava.TicketManagement.service.dto;

import com.endava.TicketManagement.repository.model.Event;
import com.endava.TicketManagement.repository.model.Order;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonSerialize
public class TicketCategoryDto {
    private Long ticketCategoryID;
    private String ticketCategoryDescription;
    private float ticketCategoryPrice;
    private Order order;
    private Event event;
}
