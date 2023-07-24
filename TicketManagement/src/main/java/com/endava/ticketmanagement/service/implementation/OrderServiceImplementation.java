package com.endava.TicketManagement.service.implementation;

import com.endava.TicketManagement.repository.CustomerRepository;
import com.endava.TicketManagement.repository.OrderRepository;
import com.endava.TicketManagement.repository.TicketCategoryRepository;
import com.endava.TicketManagement.repository.model.Customer;
import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.repository.model.TicketCategory;
import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import com.endava.TicketManagement.service.mapper.OrderToOrderDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImplementation implements OrderService {
    private OrderRepository orderRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    private CustomerRepository customerRepository;
    @Autowired
    public OrderServiceImplementation(OrderRepository orderRepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository){
        this.ticketCategoryRepository =ticketCategoryRepository;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<OrderDto> findByNumberOfTickets(int numberOfTickets) {
        return orderRepository.findByNumberOfTickets(numberOfTickets).stream().map(OrderToOrderDtoMapper::converter).collect(Collectors.toList());
    }

    @Override
    public List<OrderDto> findAll() {return orderRepository.findAll().stream().map(OrderToOrderDtoMapper::converter).collect(Collectors.toList());}

    @Override
    public void createOrder(OrderDto orderDto,Long customerID) {
        Order order = new Order();

        TicketCategory ticketCategory = ticketCategoryRepository.
                findByTicketCategoryID(orderDto.getTicketCategory().
                        getTicketCategoryID());
        LocalDateTime localDateTime = LocalDateTime.now();

        Customer customer = customerRepository.findByCustomerID(customerID);

        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        order.setOrderedAt(localDateTime);
        order.setNumberOfTickets(orderDto.getNumberOfTickets());
        order.setTotalPrice(orderDto.getNumberOfTickets()*order.getTicketCategory().
                getTicketCategoryPrice());
        orderRepository.save(order);
    }

}
