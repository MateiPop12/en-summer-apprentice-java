package com.endava.TicketManagement.service;

import com.endava.TicketManagement.service.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public interface CustomerService{
    public CustomerDto findByCustomerID(Long customerID);
}
