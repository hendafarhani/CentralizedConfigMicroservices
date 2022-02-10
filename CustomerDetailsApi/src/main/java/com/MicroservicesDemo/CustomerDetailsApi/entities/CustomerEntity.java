package com.MicroservicesDemo.CustomerDetailsApi.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@Entity
@Table(name="customer")
public class CustomerEntity {

    private static final long serialVersionUID = -4990299379926238404L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Email
    @Column(name = "email",nullable = false, unique = true)
    private String email;


}
