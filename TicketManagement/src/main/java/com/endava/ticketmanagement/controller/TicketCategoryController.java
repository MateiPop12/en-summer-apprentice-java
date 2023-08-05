package com.endava.TicketManagement.controller;

import com.endava.TicketManagement.service.TicketCategoryService;
import com.endava.TicketManagement.service.dto.TicketCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticketCategory")
public class TicketCategoryController {
    private final TicketCategoryService ticketCategoryService;
    @Autowired
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<TicketCategoryDto> findAll(){
        System.out.println("Request ticketCategory/all");
        return ticketCategoryService.findAll();
    }
    @RequestMapping(value = "/find/{ticketCategoryID}",method = RequestMethod.GET)
    public TicketCategoryDto findByTicketCategoryId(@PathVariable Long ticketCategoryID){
        System.out.println("Request ticketCategory/find/"+ticketCategoryID);
        return ticketCategoryService.findByTicketCategoryID(ticketCategoryID);
    }

}
