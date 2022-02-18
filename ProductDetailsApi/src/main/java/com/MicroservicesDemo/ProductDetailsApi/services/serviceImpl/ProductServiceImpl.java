package com.MicroservicesDemo.ProductDetailsApi.services.serviceImpl;

import com.MicroservicesDemo.ProductDetailsApi.dto.ProductDto;
import com.MicroservicesDemo.ProductDetailsApi.entities.ProductEntity;
import com.MicroservicesDemo.ProductDetailsApi.repositories.ProductsRepository;
import com.MicroservicesDemo.ProductDetailsApi.services.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductsRepository productsRepository;

    @Override
    public ProductDto getProductById(Long id) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        ProductEntity productEntity = productsRepository.findById(id).get();
        ProductDto productDto = modelMapper.map(productEntity , ProductDto.class);
        return productDto;
    }
}
