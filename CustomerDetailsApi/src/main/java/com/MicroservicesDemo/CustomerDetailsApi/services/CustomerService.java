package com.MicroservicesDemo.CustomerDetailsApi.services;


import com.MicroservicesDemo.CustomerDetailsApi.dto.CustomerDto;
import org.springframework.stereotype.Service;


public interface CustomerService {

    public CustomerDto getCustomerById(Long id);
}
