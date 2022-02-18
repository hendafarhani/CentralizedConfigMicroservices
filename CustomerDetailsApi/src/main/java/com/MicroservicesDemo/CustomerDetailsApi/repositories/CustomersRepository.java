package com.MicroservicesDemo.CustomerDetailsApi.repositories;

import com.MicroservicesDemo.CustomerDetailsApi.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<CustomerEntity, Long> {

}
