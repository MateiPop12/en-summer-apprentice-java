package com.endava.TicketManagement.repository;

import com.endava.TicketManagement.repository.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByCustomerID(Long customerID);
}
