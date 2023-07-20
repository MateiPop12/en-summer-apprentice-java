package com.endava.TicketManagement.repository;

import com.endava.TicketManagement.repository.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    public Order findByNumberOfTickets(int numberOfTickets);
}
