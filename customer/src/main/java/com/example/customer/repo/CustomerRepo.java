package com.example.customer.repo;

import com.example.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepo extends MongoRepository<Customer,Integer> {
}
