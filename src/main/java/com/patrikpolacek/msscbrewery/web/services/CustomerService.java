package com.patrikpolacek.msscbrewery.web.services;

import com.patrikpolacek.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {
    CustomerDto getCustomerDtoById(UUID customerId);

    CustomerDto saveCustomerById(UUID postCustomerId, CustomerDto customerDto);

    void putCustomerById(UUID putCustomerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
