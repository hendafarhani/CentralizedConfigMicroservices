package com.MicroservicesDemo.ProductDetailsApi.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="product")
public class ProductEntity {

    private static final long serialVersionUID = -4990299379926238404L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code",nullable = false)
    private String code;

    @Column(name = "cost",nullable = false, unique = true)
    private BigDecimal cost;

}
