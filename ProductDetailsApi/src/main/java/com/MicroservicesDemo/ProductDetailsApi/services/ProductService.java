package com.MicroservicesDemo.ProductDetailsApi.services;

import com.MicroservicesDemo.ProductDetailsApi.dto.ProductDto;
import org.springframework.stereotype.Service;


public interface ProductService {
    public ProductDto getProductById(Long id);
}
