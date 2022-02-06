package com.MicroservicesDemo.CustomerDetailsApi.controllers;

import com.MicroservicesDemo.CustomerDetailsApi.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @GetMapping
    public CustomerDto customerDetails(@PathVariable("id") String id) throws Exception {
        if (id != null && !id.isEmpty()) {
            CustomerDto customerDto = new CustomerDto("Henda", "Farhani", "henda.farhani@gmail.com");
            return customerDto;
        }
        throw new Exception("id can not be empty");
    }

}
