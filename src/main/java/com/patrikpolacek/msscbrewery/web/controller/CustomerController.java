package com.patrikpolacek.msscbrewery.web.controller;

import com.patrikpolacek.msscbrewery.web.model.CustomerDto;
import com.patrikpolacek.msscbrewery.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerDtoById(customerId), HttpStatus.OK);
    }

    @PostMapping("/{postCustomerId")
    public ResponseEntity<CustomerDto> postCustomerById(@PathVariable("postCustomerId") UUID postCustomerId,
                                                        @RequestBody CustomerDto customerDto) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location", "/api/v1/customer" + customerDto.getId().toString());
        CustomerDto savedCustomerDti = customerService.saveCustomerById(postCustomerId, customerDto);
        customerService.saveCustomerById(postCustomerId, customerDto);
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
    @PutMapping("/{putCustomerId}")
    public ResponseEntity<CustomerDto> putCustomerById(@PathVariable UUID putCustomerId,
                                                       @RequestBody CustomerDto customerDto) {
        customerService.putCustomerById(putCustomerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{deleteCustomerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable("deleteCustomerId") UUID customerId){
        customerService.deleteCustomerById(customerId);
    }


}
