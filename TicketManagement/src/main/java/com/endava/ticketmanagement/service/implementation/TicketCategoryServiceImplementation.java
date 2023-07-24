package com.endava.TicketManagement.service.implementation;

import com.endava.TicketManagement.repository.TicketCategoryRepository;
import com.endava.TicketManagement.repository.model.TicketCategory;
import com.endava.TicketManagement.service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImplementation implements TicketCategoryService {

    private TicketCategoryRepository ticketCategoryRepository;
    public TicketCategoryServiceImplementation(TicketCategoryRepository ticketCategoryRepository){
        this.ticketCategoryRepository = ticketCategoryRepository;
    }
    @Override
    public TicketCategory findByTicketCategoryID(Long ticketCategoryId) {
        return null;
    }
}
