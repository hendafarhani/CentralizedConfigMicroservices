package com.MicroservicesDemo.ProductDetailsApi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

    private String name;
    private String code;
    private BigDecimal cost;
}
