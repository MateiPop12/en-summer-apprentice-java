package com.endava.TicketManagement.service.implementation;

import com.endava.TicketManagement.repository.CustomerRepository;
import com.endava.TicketManagement.repository.OrderRepository;
import com.endava.TicketManagement.repository.TicketCategoryRepository;
import com.endava.TicketManagement.repository.model.Customer;
import com.endava.TicketManagement.repository.model.Order;
import com.endava.TicketManagement.repository.model.TicketCategory;
import com.endava.TicketManagement.service.OrderService;
import com.endava.TicketManagement.service.dto.OrderDto;
import com.endava.TicketManagement.service.dto.OrderRequestDto;
import com.endava.TicketManagement.service.mapper.OrderToOrderDtoMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImplementation implements OrderService {
    private final OrderRepository orderRepository;
    private final TicketCategoryRepository ticketCategoryRepository;
    private final CustomerRepository customerRepository;
    @Autowired
    public OrderServiceImplementation(OrderRepository orderRepository,
                                      TicketCategoryRepository ticketCategoryRepository,
                                      CustomerRepository customerRepository ){
        this.ticketCategoryRepository =ticketCategoryRepository;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<OrderDto> findByNumberOfTickets(int numberOfTickets) {
        return orderRepository.findByNumberOfTickets(numberOfTickets).stream().map(OrderToOrderDtoMapper::converter).collect(Collectors.toList());
    }

    @Override
    public OrderDto findByCustomerCustomerID(Long customerID) {
        return OrderToOrderDtoMapper.converter(orderRepository.findByCustomerCustomerID(customerID));
    }

    @Override
    public List<OrderDto> findAll() {return orderRepository.findAll().stream().map(OrderToOrderDtoMapper::converter).collect(Collectors.toList());}

    @Override
    public OrderDto createOrder(OrderRequestDto orderRequestDto, Long customerID) {

        Long ticketCategoryId = orderRequestDto.getTicketCategoryID();
        if (ticketCategoryId == null) {
            throw new IllegalArgumentException("TicketCategoryId cannot be null");
        }
        TicketCategory ticketCategory = ticketCategoryRepository.
                findByTicketCategoryID(orderRequestDto.getTicketCategoryID());
        Customer customer = customerRepository.findByCustomerID(customerID);

        if (customer == null||ticketCategory == null) {
            throw new EntityNotFoundException("TicketCategory, or Customer not found.");
        }

        Order order = new Order();

        order.setTicketCategory(ticketCategory);
        order.setCustomer(customer);
        order.setOrderedAt(LocalDateTime.now());
        order.setNumberOfTickets(orderRequestDto.getNumberOfTickets());
        order.setTotalPrice(orderRequestDto.getNumberOfTickets()*ticketCategory.
                getTicketCategoryPrice());
        orderRepository.save(order);
        return OrderToOrderDtoMapper.converter(order);
    }

}
