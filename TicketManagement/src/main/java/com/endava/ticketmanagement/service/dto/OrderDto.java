package com.endava.TicketManagement.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Long orderID;
    private Date orderedAt;
    private int numberOfTickets;
    private float totalPrice;

}
