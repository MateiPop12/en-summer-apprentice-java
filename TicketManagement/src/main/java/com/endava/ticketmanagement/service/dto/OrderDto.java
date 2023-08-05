package com.endava.TicketManagement.service.dto;

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
    private Long eventID;
    private LocalDateTime orderedAt;
    private Long ticketCategoryID;
    private int numberOfTickets;
    private float totalPrice;
}
