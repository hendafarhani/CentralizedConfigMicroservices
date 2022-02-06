package com.MicroservicesDemo.ProductDetailsApi.controllers;

import com.MicroservicesDemo.ProductDetailsApi.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/customers")
public class ProductsController {

    @GetMapping
    public ProductDto productDtoDetails(@PathVariable("id") String id) throws Exception {
        if (id != null && !id.isEmpty()) {
            ProductDto productDto = new ProductDto("product", "98943GK", new BigDecimal(100));
            return productDto;
        }
        throw new Exception("id can not be empty");
    }
}
