package com.MicroservicesDemo.CustomerDetailsApi.controllers;

import com.MicroservicesDemo.CustomerDetailsApi.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    public Environment env;

    @GetMapping("/shared/code")
    public String code(){
        return env.getProperty("shared.code");
    }

    @GetMapping("/specific/code")
    public String codeSpecific(){
        return env.getProperty("specific.code");
    }

    @GetMapping
    public CustomerDto customerDetails(@PathVariable("id") String id) throws Exception {
        if (id != null && !id.isEmpty()) {
            CustomerDto customerDto = new CustomerDto("Henda", "Farhani", "henda.farhani@gmail.com");
            return customerDto;
        }
        throw new Exception("id can not be empty");
    }

}
