package com.MicroservicesDemo.CustomerDetailsApi.controllers;

import com.MicroservicesDemo.CustomerDetailsApi.dto.CustomerDto;
import com.MicroservicesDemo.CustomerDetailsApi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    public Environment env;

    @Autowired
    CustomerService customerService;

    @GetMapping("/shared/code")
    public String code() {
        return env.getProperty("shared.code");
    }

    @GetMapping("/specific/code")
    public String codeSpecific() {
        return env.getProperty("specific.code");
    }

    @GetMapping("/{id}")
    public CustomerDto customerDetails(@PathVariable Long id) throws Exception {
        if (id != null) {
            CustomerDto customerDto = customerService.getCustomerById(id);
            return customerDto;
        }
        throw new Exception("id can not be empty");
    }

}
