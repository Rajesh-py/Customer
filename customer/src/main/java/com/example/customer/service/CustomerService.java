package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repository;


    public Customer addCustomer(Customer customer){
        return repository.save(customer);
    }
}
