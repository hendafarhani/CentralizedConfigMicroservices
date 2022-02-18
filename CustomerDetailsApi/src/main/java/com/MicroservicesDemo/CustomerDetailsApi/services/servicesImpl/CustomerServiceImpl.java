package com.MicroservicesDemo.CustomerDetailsApi.services.servicesImpl;

import com.MicroservicesDemo.CustomerDetailsApi.dto.CustomerDto;
import com.MicroservicesDemo.CustomerDetailsApi.entities.CustomerEntity;
import com.MicroservicesDemo.CustomerDetailsApi.repositories.CustomersRepository;
import com.MicroservicesDemo.CustomerDetailsApi.services.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomersRepository customersRepository;

    @Override
    public CustomerDto getCustomerById(Long id) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerEntity customerEntity = customersRepository.findById(id).get();
        CustomerDto customerDto = modelMapper.map(customerEntity, CustomerDto.class);
        return customerDto;
    }
}
