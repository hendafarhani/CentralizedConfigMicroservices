package com.MicroservicesDemo.ProductDetailsApi.repositories;

import com.MicroservicesDemo.ProductDetailsApi.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<ProductEntity, Long> {
}
