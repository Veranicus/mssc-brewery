package com.patrikpolacek.msscbrewery.web.services;

import com.patrikpolacek.msscbrewery.web.model.CustomerDto;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Data
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerDtoById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Benjamin Franklin")
                .build();
    }

    @Override
    public CustomerDto saveCustomerById(UUID postCustomerId, CustomerDto customerDto) {
        return CustomerDto.builder()
                .name("posted")
                .build();
    }

    @Override
    public void putCustomerById(UUID putCustomerId, CustomerDto customerDto) {
//    todo implement put logic
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("deleting by id..." + customerId.toString());
    }
}
