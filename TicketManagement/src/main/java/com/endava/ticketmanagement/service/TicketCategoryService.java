package com.endava.TicketManagement.service;

import com.endava.TicketManagement.repository.model.TicketCategory;
import org.springframework.stereotype.Component;

@Component
public interface TicketCategoryService {
    public TicketCategory findByTicketCategoryID(Long ticketCategoryId);
}
