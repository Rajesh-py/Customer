package com.example.customer.controller;

import com.example.customer.model.Account;
import com.example.customer.model.Customer;
import com.example.customer.model.RequireResponse;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private RestTemplate restTemplate;





}
