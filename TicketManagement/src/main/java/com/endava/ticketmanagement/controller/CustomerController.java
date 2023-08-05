package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.CustomerService;
import com.endava.TicketManagement.service.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;
    @Autowired
    CustomerController(CustomerService customerService){this.customerService=customerService;}

    @RequestMapping(value = "/find/{customerId}", method = RequestMethod.GET)
    public CustomerDto findByCustomerId(@PathVariable Long customerId){
        System.out.println("Request customer/find/"+customerId);
        return customerService.findByCustomerID(customerId);
    }

}
